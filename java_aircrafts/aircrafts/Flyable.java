package java_aircrafts.aircrafts;

import java_aircrafts.tower.Tower;

public abstract class Flyable {
    protected Tower tower = null;

    public void registerTower(Tower tower){
        this.tower = tower;
        this.tower.register(this);
    }
     
    public abstract String toString();

    public abstract void updateConditions();
}