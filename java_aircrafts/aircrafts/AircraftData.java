package java_aircrafts.aircrafts;
import java_aircrafts.aircrafts.Coordinates;

public enum AircraftData {
    HELICOPTER(
        "Today looks like a good day",
        "Today is shower day",
        "Hope no one is in front",
        "So cold",
        new Coordinates(0, 10, 2),
        new Coordinates(5, 0, 0),
        new Coordinates(1, 0, 0),
        new Coordinates(0, 0, -12)
    ),
    JET_PLANE(
        "Today looks like a good day",
        "Today is shower day",
        "Hope no one is in front",
        "So cold",
        new Coordinates(0, 10, 2),
        new Coordinates(5, 0, 0),
        new Coordinates(1, 0, 0),
        new Coordinates(0, 0, -12)
    ),
    BALLOON(
        "Today looks like a good day",
        "Today is shower day",
        "Hope no one is in front",
        "So cold",
        new Coordinates(0, 10, 2),
        new Coordinates(5, 0, 0),
        new Coordinates(1, 0, 0),
        new Coordinates(0, 0, -12)
    );

    final String sun_message;
    final String rain_message;
    final String fog_message;
    final String snow_message;
    final Coordinates sun_delta;
    final Coordinates rain_delta;
    final Coordinates fog_delta;
    final Coordinates snow_delta;

    AircraftData(
        String sun_message,
        String rain_message,
        String fog_message,
        String snow_message,
        Coordinates sun_delta,
        Coordinates rain_delta,
        Coordinates fog_delta,
        Coordinates snow_delta
    ) {
        this.sun_message = sun_message;
        this.rain_message = rain_message;
        this.fog_message = sun_message;
        this.snow_message = snow_message;
        this.sun_delta = sun_delta;
        this.rain_delta = rain_delta;
        this.fog_delta = fog_delta;
        this.snow_delta = snow_delta;
    }

}