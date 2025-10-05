package java_aircrafts.aircrafts;

import java_aircrafts.tower.Tower;

public abstract class Flyable {
    protected Tower tower = null;
    // protected long id;

    public void registerTower(Tower tower){
        this.tower = tower;
        this.tower.register(this);
        System.out.println("IS TOWER NULL IN PARENT " + this.tower == null);
    }
     
    public abstract String toString();

    public abstract void updateConditions();

    // public long getId() {
        // return this.id;
    // }
}