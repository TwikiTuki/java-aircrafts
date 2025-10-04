package java_aircrafts.aircrafts;
import java_aircrafts.aircrafts.Aircraft;
import java_aircrafts.aircrafts.Helicopter;

public class AircraftFactory {
    public static final String HELICOPTER = "Helicopter";
    public static final String JET_PLANE = "JetPlane";
    public static final String BALLON = "Baloon";

    private static final AircraftFactory factory = new AircraftFactory(); 
    private long nextId =  0; 

    private AircraftFactory(){}

    public static AircraftFactory getFactory() {
        return AircraftFactory.factory;
    }

    public Aircraft newAircraft(String type, String name, Coordinates coordinates) {
        switch (type) {
            case HELICOPTER: 
                return new Helicopter(this.nextId++, name, coordinates);
        }
        return null;
    }
}