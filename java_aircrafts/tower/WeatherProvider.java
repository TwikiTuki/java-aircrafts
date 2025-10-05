package java_aircrafts.tower;
import java_aircrafts.aircrafts.Coordinates;
import java_aircrafts.tower.Weather;
import java.util.ArrayList;
import java.util.Random;


public class WeatherProvider {
    public static final String SUN = "SUN";
    public static final String RAIN = "RAIN";
    public static final String FOG = "FOG";
    public static final String SNOW = "SNOW";

    private static final String[] weather = {"SUN", "RAIN", "FOG", "SNOW"};
    private static final WeatherProvider weatherProvider = new WeatherProvider();

    private Random rand = new Random();
    private long salt;

    private WeatherProvider() {
        this.salt = this.rand.nextLong();
    }

    private WeatherProvider(long salt) {
        this.salt = salt;
    }

    static WeatherProvider getProvider() {
        return weatherProvider;
    }

    public String getCurrentWeather(Coordinates coordinates) {
        this.rand.setSeed(coordinates.getLongitude() * coordinates.getLatitude() * coordinates.getHeight() * salt);
        int randNum = this.rand.nextInt(10);
        randNum = randNum < 4 ? randNum : 3; 
        randNum = 3;
        return weather[randNum];
    }

}