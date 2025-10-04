package java_aircrafts.aircrafts;
import java_aircrafts.aircrafts.AircraftFactory;
import java_aircrafts.aircrafts.Aircraft;
import java_aircrafts.aircrafts.Helicopter;
import java_aircrafts.aircrafts.Coordinates;
import java_aircrafts.tower.WeatherTower;

public class Simulator {
    public Simulator() {}
    public void run() {
        System.out.println("Hellow java_aircrafts");
        System.out.println("Getting factory");
        AircraftFactory factory = AircraftFactory.getFactory();
        System.out.println("Creating Helicopter ");
        Helicopter helicopter = (Helicopter) factory.newAircraft("Helicopter", "myCopter", new Coordinates(10, 10, 10));
        WeatherTower tower = new WeatherTower();
        // tower.register(helicopter);
        helicopter.registerTower(tower);
        tower.changeWeather();
        tower.changeWeather();
        tower.changeWeather();
        tower.changeWeather();
    }
}