package java_aircrafts.aircrafts;
import java_aircrafts.aircrafts.Aircraft;
import java_aircrafts.tower.WeatherProvider;

public class JetPlane extends Aircraft {
    // private static final String SUN_MESSAGE = "Today looks like a good day";
    // private static final String RAIN_MESSAGE = "Today is shower day";
    // private static final String FOG_MESSAGE = "Hope no one is in front";
    // private static final String SNOW_MESSAGE = "So cold";
    // private static final Coordinates SUN_DELTA = new Coordinates(0, 10, 2);
    // private static final Coordinates RAIN_DELTA = new Coordinates(5, 0, 0);
    // private static final Coordinates FOG_DELTA = new Coordinates(1, 0, 0);
    // private static final Coordinates SNOW_DELTA = new Coordinates(0, 0, -12);

    public final AircraftData typeData;

    public JetPlane(long id, String name, Coordinates coordinates) {
        super(id, name, coordinates);
        this.typeData = AircraftData.JET_PLANE;
    }

    public AircraftData getTypeData(){
        return this.typeData;
    }

}