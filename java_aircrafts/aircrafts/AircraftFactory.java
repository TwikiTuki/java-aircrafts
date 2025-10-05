package java_aircrafts.aircrafts;
import java_aircrafts.aircrafts.Aircraft;
import java_aircrafts.aircrafts.Helicopter;
import java_aircrafts.aircrafts.JetPlane;
import java_aircrafts.aircrafts.Balloon;
import java_aircrafts.aircrafts.exceptions.InvalidAircraftType;

public class AircraftFactory {
    public static final String HELICOPTER = "Helicopter";
    public static final String JET_PLANE = "JetPlane";
    public static final String BALLOON = "Balloon";

    private static final AircraftFactory factory = new AircraftFactory(); 
    private long nextId =  0; 

    private AircraftFactory(){}

    public static AircraftFactory getFactory() {
        return AircraftFactory.factory;
    }

    public Aircraft newAircraft(String type, String name, Coordinates coordinates) throws InvalidAircraftType {
        switch (type) {
            case HELICOPTER: 
                return new Helicopter(this.nextId++, name, coordinates);
            case JET_PLANE: 
                return new JetPlane(this.nextId++, name, coordinates);
            case BALLOON: 
                return new Balloon(this.nextId++, name, coordinates);
            default: 
                throw new InvalidAircraftType(type);
        }
    }
}