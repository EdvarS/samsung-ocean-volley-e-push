package br.com.cucha.oceanws;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by eduardocucharro on 23/10/16.
 */

public class GroupForecastEntities {
    public class Clouds {

        @SerializedName("all")
        @Expose
        private int all;

        /**
         *
         * @return
         * The all
         */
        public int getAll() {
            return all;
        }

        /**
         *
         * @param all
         * The all
         */
        public void setAll(int all) {
            this.all = all;
        }

    }
    public class Coord {

        @SerializedName("lon")
        @Expose
        private double lon;
        @SerializedName("lat")
        @Expose
        private double lat;

        /**
         *
         * @return
         * The lon
         */
        public double getLon() {
            return lon;
        }

        /**
         *
         * @param lon
         * The lon
         */
        public void setLon(double lon) {
            this.lon = lon;
        }

        /**
         *
         * @return
         * The lat
         */
        public double getLat() {
            return lat;
        }

        /**
         *
         * @param lat
         * The lat
         */
        public void setLat(double lat) {
            this.lat = lat;
        }

    }
    public class Example {

        @SerializedName("cnt")
        @Expose
        private int cnt;
        @SerializedName("list")
        @Expose
        private java.util.List<City> list = new ArrayList<City>();

        /**
         *
         * @return
         * The cnt
         */
        public int getCnt() {
            return cnt;
        }

        /**
         *
         * @param cnt
         * The cnt
         */
        public void setCnt(int cnt) {
            this.cnt = cnt;
        }

        /**
         *
         * @return
         * The list
         */
        public java.util.List<City> getList() {
            return list;
        }

        /**
         *
         * @param list
         * The list
         */
        public void setList(java.util.List<City> list) {
            this.list = list;
        }

    }
    public class City {

        @SerializedName("coord")
        @Expose
        private Coord coord;
        @SerializedName("sys")
        @Expose
        private Sys sys;
        @SerializedName("weather")
        @Expose
        private java.util.List<Weather> weather = new ArrayList<Weather>();
        @SerializedName("main")
        @Expose
        private Main main;
        @SerializedName("wind")
        @Expose
        private Wind wind;
        @SerializedName("clouds")
        @Expose
        private Clouds clouds;
        @SerializedName("dt")
        @Expose
        private int dt;
        @SerializedName("id")
        @Expose
        private int id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("rain")
        @Expose
        private Rain rain;

        /**
         *
         * @return
         * The coord
         */
        public Coord getCoord() {
            return coord;
        }

        /**
         *
         * @param coord
         * The coord
         */
        public void setCoord(Coord coord) {
            this.coord = coord;
        }

        /**
         *
         * @return
         * The sys
         */
        public Sys getSys() {
            return sys;
        }

        /**
         *
         * @param sys
         * The sys
         */
        public void setSys(Sys sys) {
            this.sys = sys;
        }

        /**
         *
         * @return
         * The weather
         */
        public java.util.List<Weather> getWeather() {
            return weather;
        }

        /**
         *
         * @param weather
         * The weather
         */
        public void setWeather(java.util.List<Weather> weather) {
            this.weather = weather;
        }

        /**
         *
         * @return
         * The main
         */
        public Main getMain() {
            return main;
        }

        /**
         *
         * @param main
         * The main
         */
        public void setMain(Main main) {
            this.main = main;
        }

        /**
         *
         * @return
         * The wind
         */
        public Wind getWind() {
            return wind;
        }

        /**
         *
         * @param wind
         * The wind
         */
        public void setWind(Wind wind) {
            this.wind = wind;
        }

        /**
         *
         * @return
         * The clouds
         */
        public Clouds getClouds() {
            return clouds;
        }

        /**
         *
         * @param clouds
         * The clouds
         */
        public void setClouds(Clouds clouds) {
            this.clouds = clouds;
        }

        /**
         *
         * @return
         * The dt
         */
        public int getDt() {
            return dt;
        }

        /**
         *
         * @param dt
         * The dt
         */
        public void setDt(int dt) {
            this.dt = dt;
        }

        /**
         *
         * @return
         * The id
         */
        public int getId() {
            return id;
        }

        /**
         *
         * @param id
         * The id
         */
        public void setId(int id) {
            this.id = id;
        }

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         *
         * @return
         * The rain
         */
        public Rain getRain() {
            return rain;
        }

        /**
         *
         * @param rain
         * The rain
         */
        public void setRain(Rain rain) {
            this.rain = rain;
        }

    }
    public class Main {

        @SerializedName("temp")
        @Expose
        private double temp;
        @SerializedName("temp_min")
        @Expose
        private double tempMin;
        @SerializedName("temp_max")
        @Expose
        private double tempMax;
        @SerializedName("pressure")
        @Expose
        private double pressure;
        @SerializedName("sea_level")
        @Expose
        private double seaLevel;
        @SerializedName("grnd_level")
        @Expose
        private double grndLevel;
        @SerializedName("humidity")
        @Expose
        private int humidity;

        /**
         *
         * @return
         * The temp
         */
        public double getTemp() {
            return temp;
        }

        /**
         *
         * @param temp
         * The temp
         */
        public void setTemp(double temp) {
            this.temp = temp;
        }

        /**
         *
         * @return
         * The tempMin
         */
        public double getTempMin() {
            return tempMin;
        }

        /**
         *
         * @param tempMin
         * The temp_min
         */
        public void setTempMin(double tempMin) {
            this.tempMin = tempMin;
        }

        /**
         *
         * @return
         * The tempMax
         */
        public double getTempMax() {
            return tempMax;
        }

        /**
         *
         * @param tempMax
         * The temp_max
         */
        public void setTempMax(double tempMax) {
            this.tempMax = tempMax;
        }

        /**
         *
         * @return
         * The pressure
         */
        public double getPressure() {
            return pressure;
        }

        /**
         *
         * @param pressure
         * The pressure
         */
        public void setPressure(double pressure) {
            this.pressure = pressure;
        }

        /**
         *
         * @return
         * The seaLevel
         */
        public double getSeaLevel() {
            return seaLevel;
        }

        /**
         *
         * @param seaLevel
         * The sea_level
         */
        public void setSeaLevel(double seaLevel) {
            this.seaLevel = seaLevel;
        }

        /**
         *
         * @return
         * The grndLevel
         */
        public double getGrndLevel() {
            return grndLevel;
        }

        /**
         *
         * @param grndLevel
         * The grnd_level
         */
        public void setGrndLevel(double grndLevel) {
            this.grndLevel = grndLevel;
        }

        /**
         *
         * @return
         * The humidity
         */
        public int getHumidity() {
            return humidity;
        }

        /**
         *
         * @param humidity
         * The humidity
         */
        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

    }
    public class Rain {

        @SerializedName("3h")
        @Expose
        private double _3h;

        /**
         *
         * @return
         * The _3h
         */
        public double get3h() {
            return _3h;
        }

        /**
         *
         * @param _3h
         * The 3h
         */
        public void set3h(double _3h) {
            this._3h = _3h;
        }

    }
    public class Sys {

        @SerializedName("message")
        @Expose
        private double message;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("sunrise")
        @Expose
        private int sunrise;
        @SerializedName("sunset")
        @Expose
        private int sunset;

        /**
         *
         * @return
         * The message
         */
        public double getMessage() {
            return message;
        }

        /**
         *
         * @param message
         * The message
         */
        public void setMessage(double message) {
            this.message = message;
        }

        /**
         *
         * @return
         * The country
         */
        public String getCountry() {
            return country;
        }

        /**
         *
         * @param country
         * The country
         */
        public void setCountry(String country) {
            this.country = country;
        }

        /**
         *
         * @return
         * The sunrise
         */
        public int getSunrise() {
            return sunrise;
        }

        /**
         *
         * @param sunrise
         * The sunrise
         */
        public void setSunrise(int sunrise) {
            this.sunrise = sunrise;
        }

        /**
         *
         * @return
         * The sunset
         */
        public int getSunset() {
            return sunset;
        }

        /**
         *
         * @param sunset
         * The sunset
         */
        public void setSunset(int sunset) {
            this.sunset = sunset;
        }

    }
    public class Weather {

        @SerializedName("id")
        @Expose
        private int id;
        @SerializedName("main")
        @Expose
        private String main;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("icon")
        @Expose
        private String icon;

        /**
         *
         * @return
         * The id
         */
        public int getId() {
            return id;
        }

        /**
         *
         * @param id
         * The id
         */
        public void setId(int id) {
            this.id = id;
        }

        /**
         *
         * @return
         * The main
         */
        public String getMain() {
            return main;
        }

        /**
         *
         * @param main
         * The main
         */
        public void setMain(String main) {
            this.main = main;
        }

        /**
         *
         * @return
         * The description
         */
        public String getDescription() {
            return description;
        }

        /**
         *
         * @param description
         * The description
         */
        public void setDescription(String description) {
            this.description = description;
        }

        /**
         *
         * @return
         * The icon
         */
        public String getIcon() {
            return icon;
        }

        /**
         *
         * @param icon
         * The icon
         */
        public void setIcon(String icon) {
            this.icon = icon;
        }

    }
    public class Wind {

        @SerializedName("speed")
        @Expose
        private double speed;
        @SerializedName("deg")
        @Expose
        private double deg;

        /**
         *
         * @return
         * The speed
         */
        public double getSpeed() {
            return speed;
        }

        /**
         *
         * @param speed
         * The speed
         */
        public void setSpeed(double speed) {
            this.speed = speed;
        }

        /**
         *
         * @return
         * The deg
         */
        public double getDeg() {
            return deg;
        }

        /**
         *
         * @param deg
         * The deg
         */
        public void setDeg(double deg) {
            this.deg = deg;
        }

    }
}
