package java_aircrafts.tower;

/** DEPRECATED WeatherProvider has to save Weather in a String. Not able to do it in an enum :( */
public enum Weather {
    SUN("SUN"),
    RAIN("RAIN"),
    FOG("FOG"),
    SNOW("SNOW");

    private String name;

    private Weather() {}
    private Weather(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}