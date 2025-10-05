package java_aircrafts.tower;
import java_aircrafts.aircrafts.Flyable;
import java.util.ArrayList;
import java.util.Collection;

public class Tower {
    private static final String TOWER_SAYS = "Tower says" ;
    private static final String REGISTERED =  "registered to weather tower";
    private static final String UNREGISTERED = "unregistered from weather tower";
    private ArrayList<Flyable> observers;
    Tower() {
        this.observers = new ArrayList<Flyable>();
    }

    public void register(Flyable flyable) {
        System.out.println(String.format("%s: %s %s", this.TOWER_SAYS, flyable.toString(), this.REGISTERED));
        this.observers.add(flyable);
    } 

    public void unregister(Flyable flyable) {
        this.observers.remove(flyable);
        System.out.println(String.format("%s: %s %s", this.TOWER_SAYS, flyable.toString(), this.UNREGISTERED));
        // for (int i  = 0; i < this.observers.size(); i++) {
            // if (this.observers.get(i).getId() == flyable.getId()){
                // System.out.println(String.format("%s: %s %s", this.TOWER_SAYS, this.observers.get(i).toString(), this.UNREGISTERED));
                // this.observers.remove(i);
                // return;
            // }
        // }
    }

    protected void condtionChanged() {
        // for (Flyable observer : this.observers) {
        for (int i = this.observers.size() - 1; i >= 0; i--) {
            this.observers.get(i).updateConditions();
        }
    }
}