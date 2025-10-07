package java_aircrafts.aircrafts;
import java_aircrafts.aircrafts.AircraftFactory;
import java_aircrafts.aircrafts.Aircraft;
import java_aircrafts.aircrafts.Helicopter;
import java_aircrafts.aircrafts.JetPlane;
import java_aircrafts.aircrafts.Balloon;
import java_aircrafts.aircrafts.Coordinates;
import java_aircrafts.aircrafts.Simulator;
import java_aircrafts.aircrafts.Coordinates;
import java_aircrafts.aircrafts.ParsedData;
import java_aircrafts.aircrafts.exceptions.InvalidAircraftType;
import java_aircrafts.tower.WeatherTower;

public class Simulator {
    public Simulator() {}
    public void run(ParsedData simulationData) {
        System.out.println();
        AircraftFactory factory = AircraftFactory.getFactory();
        WeatherTower tower = new WeatherTower();
        System.out.println("Registering aircrafts to tower");
        for (Flyable f : simulationData.aircrafts) {
            f.registerTower(tower);
        }
        System.out.println();
        System.out.println("Starting simulation");
        for (int i = 0; i < simulationData.iterations; i++) {
            tower.changeWeather();
        }
    }
    public void testRun() throws InvalidAircraftType {
        System.out.println("Hellow java_aircrafts");
        System.out.println("Getting factory");
        AircraftFactory factory = AircraftFactory.getFactory();
        System.out.println("Creating Helicopter ");
        Helicopter helicopter = (Helicopter) factory.newAircraft("Helicopter", "myCopter", new Coordinates(10, 10, 50));
        WeatherTower tower = new WeatherTower();
        // tower.register(helicopter);
        helicopter.registerTower(tower);
            // tower.changeWeather();
            // tower.changeWeather();
            // tower.changeWeather();
        for (int i = 0; i < 10; i++){
            tower.changeWeather();
        }
    }
}