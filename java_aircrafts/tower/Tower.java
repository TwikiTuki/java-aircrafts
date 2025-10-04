package java_aircrafts.tower;
import java_aircrafts.aircrafts.Flyable;
import java.util.ArrayList;

public class Tower {
    private ArrayList<Flyable> observers;
    Tower() {
        this.observers = new ArrayList<Flyable>();
    }

    public void register(Flyable flyable) {
        this.observers.add(flyable);
    } 

    public void unregister(Flyable flyable) {
        for (int i  = 0; i < this.observers.size(); i++) {
            if (this.observers.get(i).getId() == flyable.getId()){
                this.observers.remove(i);
                return;
            }
        }
    }
}