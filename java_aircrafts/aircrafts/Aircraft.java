package java_aircrafts.aircrafts;
import java_aircrafts.aircrafts.Flyable;
import java_aircrafts.aircrafts.Coordinates;
import java_aircrafts.tower.WeatherTower;
import java_aircrafts.tower.WeatherProvider;

public abstract class Aircraft extends Flyable{
    protected String name;
    protected Coordinates coordinates;
    protected long id;  

    protected Aircraft(long id, String name, Coordinates coordinates) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
    }

    public String getName(){
        return this.name;
    }

    public long getId() {
        return this.id;
    }

    public abstract AircraftData getTypeData();


    public Coordinates getCoordinates(){
        return this.coordinates;
    }

    public String toString() {
        String clss = this.getClass().getSimpleName();
        return String.format("%s#%s(%s)", clss, this.getName(), this.getId());
    }

    public void updateConditions(){
        System.out.println("A helicopter is updating its conditions");
        WeatherTower twr = (WeatherTower) this.tower;
        String weather = twr.getWeather(this.coordinates);
        String message = "";
        Coordinates deltaCoordinates = null;
        Coordinates newCoordinates;

        switch (weather) {
            case WeatherProvider.SUN:
                System.out.println("SUNNY conditions");
                deltaCoordinates = this.getTypeData().sun_delta;
                message = this.getTypeData().sun_message;
                break;
            case WeatherProvider.FOG:
                System.out.println("FOGGY conditions");
                deltaCoordinates = this.getTypeData().fog_delta;
                message = this.getTypeData().fog_message;
                break;
            case WeatherProvider.RAIN:
                System.out.println("RAINNY conditions");
                deltaCoordinates = this.getTypeData().rain_delta;
                message = this.getTypeData().rain_message;
                break;
            case WeatherProvider.SNOW:
                System.out.println("SNOWY conditions");
                deltaCoordinates = this.getTypeData().snow_delta;
                message = this.getTypeData().snow_message;
                break;
        }
        newCoordinates = this.coordinates.sum(deltaCoordinates);
        newCoordinates.sanitize();
        System.out.print(String.format("%s: %s (%s)->(%s).                    \t", this.toString(), message, this.coordinates.toShortString(), newCoordinates.toShortString()));
        System.out.println(String.format("   %s -- %s", this.coordinates.toString(), newCoordinates.toString()));
        this.coordinates = newCoordinates;
        if (this.getCoordinates().getHeight() == 0)
            this.tower.unregister(this);
    }
}