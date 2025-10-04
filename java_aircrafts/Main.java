package java_aircrafts;
import java_aircrafts.aircrafts.AircraftFactory;
import java_aircrafts.aircrafts.Aircraft;
import java_aircrafts.aircrafts.Helicopter;
import java_aircrafts.aircrafts.Coordinates;
import java_aircrafts.aircrafts.Simulator;

public class Main {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.run();
    }
}