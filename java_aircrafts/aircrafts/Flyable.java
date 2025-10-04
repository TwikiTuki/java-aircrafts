package java_aircrafts.aircrafts;

import java_aircrafts.tower.Tower;

public abstract class Flyable {
    protected Tower tower = null;
    protected long id;

    public void registerTower(Tower tower){
        this.tower = tower;
    }

    public abstract void updateConditions();

    public long getId() {
        return this.id;
    }

}