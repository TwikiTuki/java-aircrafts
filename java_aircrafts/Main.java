package java_aircrafts;
import java_aircrafts.aircrafts.AircraftFactory;
import java_aircrafts.aircrafts.Aircraft;
import java_aircrafts.aircrafts.Helicopter;
import java_aircrafts.aircrafts.JetPlane;
import java_aircrafts.aircrafts.Balloon;
import java_aircrafts.aircrafts.Coordinates;
import java_aircrafts.aircrafts.Simulator;
import java_aircrafts.aircrafts.ParsedData;

public class Main {
    public static void main(String[] args) throws Exception{
        if (args.length != 1)
            throw new Exception("Invalid number of arguments");
        System.out.println("Parsed data " + args[0] + ": ");
        ParsedData data = new ParsedData(args[0]);
        data.print();
        Simulator simulator = new Simulator();
        simulator.run(data);
        System.out.println("THE END");
    }
}