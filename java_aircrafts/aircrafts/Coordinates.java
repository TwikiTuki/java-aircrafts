package java_aircrafts.aircrafts;
import  java_aircrafts.aircrafts.exceptions.InvalidCoordinateValues;

public class Coordinates {
    public static final int MIN_HEIGHT = 0;
    public static final int MAX_HEIGHT = 100;
    public static final int MIN_LATITUDE = 1;
    public static final int MIN_LONGITUDE = 1;
    private int longitude;
    private int latitude;
    private int height;

    Coordinates(int longitude, int latitude, int height) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.height = height;
    }

    public int getLongitude(){
        return this.latitude;
    }

    public int getLatitude(){
        return this.latitude;
    }

    public int getHeight(){
        return this.height;
    }

    public String toString(){
        return String.format("lon: %s, lat: %s, h: %s", this.longitude, this.latitude, this.height);
    }
    public String toShortString(){
        return String.format("%s,%s,%s", this.longitude, this.latitude, this.height);
    }

    public Coordinates sum(Coordinates coord) {
        return new Coordinates(
            this.longitude + coord.longitude,
            this.latitude + coord.latitude,
            this.height + coord.height
        );
    }


    public void sanitize() {
        this.latitude = Math.max(MIN_LATITUDE, this.latitude);
        // this.latitude = Math.min(MAX_LATITUDE, this.latitude);
        this.longitude = Math.max(MIN_LONGITUDE, this.longitude);
        // this.longitude = Math.min(MAX_LONGITUDE, this.longitude);
        this.height = Math.max(MIN_HEIGHT, this.height);
        this.height = Math.min(MAX_HEIGHT, this.height);
    }


    static boolean checkCoordinates(Coordinates coordinates) {
        return checkCoordinates(coordinates.longitude, coordinates.latitude, coordinates.height); 

    }
    static  boolean checkCoordinates(int longitude, int latitude, int height) {
        return checkLongitude(longitude) && checkLatitude(latitude) && checkHeight(height);
    }

    static boolean checkLongitude(int val) {
        return val > MIN_LONGITUDE;
    }

    static boolean checkLatitude(int val) {
        return val > MIN_LATITUDE;
    }

    static boolean checkHeight(int val) {
        return val >= MIN_HEIGHT && val <= MAX_HEIGHT;
    }

}