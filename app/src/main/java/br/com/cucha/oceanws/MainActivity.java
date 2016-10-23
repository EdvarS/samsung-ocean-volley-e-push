package br.com.cucha.oceanws;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;

public class MainActivity extends AppCompatActivity {

    private RequestQueue queue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        queue = Volley.newRequestQueue(this);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fetchEdgeCities();
            }
        });
    }

    private void fetchByCityName() {
        String url = "http://api.openweathermap.org/data/2.5/weather?q=London,uk"+
                "&appid=781b8263713d131646620af488f7659e";

        Response.Listener<JSONObject> responseListener = new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONObject main = response.getJSONObject("main");
                    double temp = main.getDouble("temp");
                    double tempMin = main.getDouble("temp_min");
                    double tempMax = main.getDouble("temp_max");
                    String name = main.getString("name");

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };

        Response.ErrorListener errorListener = new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        };

        JsonObjectRequest request = new JsonObjectRequest(url, null, responseListener, errorListener);

        queue.add(request);
    }

    private void fetchByCityNameTyped() {
        String url = "http://api.openweathermap.org/data/2.5/weather?q=London,uk"+
                "&appid=781b8263713d131646620af488f7659e";

        Response.Listener<ForecastEntities.Forecast> responseListener = new Response.Listener<ForecastEntities.Forecast>() {
            @Override
            public void onResponse(ForecastEntities.Forecast response) {

            }
        };

        Response.ErrorListener errorListener = new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        };

        JsonRequest<ForecastEntities.Forecast> request = new JsonRequest<ForecastEntities.Forecast>(url, null, responseListener, errorListener) {
            @Override
            protected Response<ForecastEntities.Forecast> parseNetworkResponse(NetworkResponse response) {

                String json = null;
                try {
                    json = new String(response.data, HttpHeaderParser.parseCharset(response.headers));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }

                Gson gson = new GsonBuilder().create();
                ForecastEntities.Forecast forecast = gson.fromJson(json, ForecastEntities.Forecast.class);

                return Response.success(forecast, HttpHeaderParser.parseCacheHeaders(response));
            }
        };

        queue.add(request);
    }

    private void fetchCityForecast() {
        String url = "http://api.openweathermap.org/data/2.5/forecast?q=London,us&mode=json" +
                "&appid=781b8263713d131646620af488f7659e";

        Response.ErrorListener errorListener = new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        };
        Response.Listener<JSONArray> responseListener = new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

            }
        };

        JsonArrayRequest request = new JsonArrayRequest(url, responseListener, errorListener);
        queue.add(request);
    }

    private void fetchEdgeCities() {
        String url = "http://api.openweathermap.org/data/2.5/group?id=3390760,3452925,3663517,3465038,3448439&units=metric" +
                "&appid=781b8263713d131646620af488f7659e";

        Response.Listener<GroupForecastEntities.Example> responseListener = new Response.Listener<GroupForecastEntities.Example>() {
            @Override
            public void onResponse(GroupForecastEntities.Example response) {

            }
        };
        Response.ErrorListener errorListener = new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        };

        JsonRequest<GroupForecastEntities.Example> request =
                new JsonRequest<GroupForecastEntities.Example>(Request.Method.GET, url, null, responseListener, errorListener) {
            @Override
            protected Response<GroupForecastEntities.Example> parseNetworkResponse(NetworkResponse response) {

                try {
                    String json = new String(response.data, HttpHeaderParser.parseCharset(response.headers));

                    Gson gson = new GsonBuilder().create();
                    GroupForecastEntities.Example groupForecast = gson.fromJson(json, GroupForecastEntities.Example.class);

                    return Response.success(groupForecast, HttpHeaderParser.parseCacheHeaders(response));

                } catch (Exception e) {

                }

                return null;
            }
        };

        queue.add(request);
    }


    //trazer temp em celsius ?units=metric
    //trazer temp da semana e mostrar na tela
    //api.openweathermap.org/data/2.5/forecast?q=London,us&mode=xml
    //trazer várias cidades de uma vez (recife, sao paulo, porto alegre, manaus, cuiaba)
    //http://api.openweathermap.org/data/2.5/group?id=524901,703448,2643743&units=metric

    //recife 3390760
    //porto alegre 3452925
    //manaus 3663517
    //cuiaba 3465038
    //sao paulo 3448439
    //san francisco 5391959
    //london 2643743
}
