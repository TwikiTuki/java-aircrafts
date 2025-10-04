package java_aircrafts.tower;
import java_aircrafts.aircrafts.Coordinates;
public class WeatherTower extends Tower {

    public String getWeather(Coordinates coordinates) {
        return WeatherProvider.getProvider().getCurrentWeather(coordinates);
    }

    public void changeWeather() {
        super.condtionChanged();
    }
}