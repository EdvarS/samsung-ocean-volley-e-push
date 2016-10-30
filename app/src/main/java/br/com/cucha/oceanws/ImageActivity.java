package br.com.cucha.oceanws;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;

public class ImageActivity extends AppCompatActivity {

    static long MB =  1048576L;
    private ActivityManager.MemoryInfo memoryInfo;
    private ActivityManager activityManager;
    private NetworkImageView networkImageView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        memoryInfo = new ActivityManager.MemoryInfo();

        activityManager = (ActivityManager) getSystemService(ACTIVITY_SERVICE);

        networkImageView = (NetworkImageView) findViewById(R.id.network_image);

        imageView = (ImageView) findViewById(R.id.image);

        String url = "https://lh3.ggpht.com/Pg6yOTKxqBqac7psqzv3Fnid4m030TeLYHbLZuX3YfSNTqRFI2jwPRdzGe7rb_ltOV-i=w300";

        final Response.Listener<Bitmap> listener = new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                imageView.setImageBitmap(response);
            }
        };

        Response.ErrorListener errorListener = new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        };

        ImageRequest imageRequest = new ImageRequest(
                url,
                listener,
                300,
                300,
                ImageView.ScaleType.CENTER,
                Bitmap.Config.ARGB_8888,
                errorListener);

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(imageRequest);

        String harleyUrl = "http://www.mrwallpaper.com/wallpapers/custom-harley-davidson-1920x1080.jpg";

        ImageLoader imageLoader = new ImageLoader(requestQueue, new LruBitmapCache(LruBitmapCache.getCacheSize(this)));
        networkImageView.setImageUrl(harleyUrl, imageLoader);
    }

    @Override
    protected void onResume() {
        super.onResume();

        //// TODO: 30/10/16 load image with imageview
        // TODO: 30/10/16 understand size constraints
        // TODO: 30/10/16 resize image from disk
        // TODO: 30/10/16 scroll to 100 images
        // TODO: 30/10/16 explain LRU strategy

        activityManager.getMemoryInfo(memoryInfo);

        long totalMem = memoryInfo.totalMem;
        double totalMB = totalMem / MB;

        long availMem = memoryInfo.availMem;
        double availMB = availMem / MB;

        double percent = availMB / totalMB;

        Log.i("memory total", String.valueOf(totalMem));

        Log.i("memory total MB", String.valueOf(totalMB));

        Log.i("memory Avail", String.valueOf(availMem));

        Log.i("memory Avail MB", String.valueOf(availMB));

        Log.i("memory Percent", String.valueOf(percent));
    }
}
