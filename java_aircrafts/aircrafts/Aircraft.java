package java_aircrafts.aircrafts;
import java_aircrafts.aircrafts.Flyable;
import java_aircrafts.aircrafts.Coordinates;

public abstract class Aircraft extends Flyable{
    protected String name;
    protected Coordinates coordinates;

    protected Aircraft(long id, String name, Coordinates coordinates) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
    }
}