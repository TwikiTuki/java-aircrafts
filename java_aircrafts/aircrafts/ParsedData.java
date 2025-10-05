package java_aircrafts.aircrafts;
import java_aircrafts.aircrafts.Aircraft;
import java_aircrafts.aircrafts.exceptions.ParsingException;
import java_aircrafts.aircrafts.exceptions.InvalidCoordinateValues;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.NumberFormatException;
import java_aircrafts.aircrafts.AircraftFactory;
import java_aircrafts.aircrafts.Coordinates;

public class ParsedData {
    public int iterations;
    public ArrayList<Aircraft> aircrafts;

    public ParsedData() {
        this.aircrafts = new ArrayList<Aircraft>();
    }

    public ParsedData(String file) throws ParsingException{
        this.aircrafts = new ArrayList<Aircraft>();
        this.parse(file);
    }

    public void print() {
        System.out.println(String.format("Iterations: %s", this.iterations));
        for (Aircraft a : this.aircrafts){
            System.out.println(String.format("Aircraft: %s", a == null ? "null" : a.toString()));
        }
    }

    public void parse(String filePath) throws ParsingException {
        String line;
        String[] params;
        AircraftFactory factory = AircraftFactory.getFactory();
        Coordinates coords;

        try (BufferedReader file = new BufferedReader(new FileReader(filePath))) {
            line = file.readLine();
            if (line == null)
                throw new ParsingException("Unable to get number of iterations. Looks like you provided an empty file.");
            try {
                this.iterations = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                throw new ParsingException("Unable to get number of iterations: " + line, e);
            }
            if (this.iterations <= 0) {
                throw new ParsingException("Number of iterations should be a positive number: " + this.iterations);
            }
            line = file.readLine();
            while (line != null) {
                params = line.split(" "); 
                if (params.length != 5)
                    throw new ParsingException(String.format("Invalid number of arguments %s", line));

                try {
                    coords = new Coordinates(
                        Integer.parseInt(params[2]),
                        Integer.parseInt(params[3]),
                        Integer.parseInt(params[4])
                    );
                    if (!Coordinates.checkCoordinates(coords))
                        throw new InvalidCoordinateValues(String.format("Invalid coordinates: [%s] -> %s", line, coords.toString()));
                    // TODO assert coordiantes are valid
                } catch (NumberFormatException e) {
                    throw new ParsingException(String.format("Invalid coordinates" + line), e);
                }
                Aircraft aircraft = factory.newAircraft(params[0], params[1], coords);
                if (aircraft == null)
                    throw new ParsingException(String.format("Unble to generate aircaft with parameters: %s, %s, %s", params[0], params[1], coords == null ? "null" : coords.toShortString()));
                this.aircrafts.add(aircraft);
                line = file.readLine();
            }
        } catch (IOException e) {
                if (e instanceof FileNotFoundException) {
                    throw new ParsingException("File does not exists: " + filePath, e);
                }
            throw new ParsingException("Problem while reading the file", e);
        }
    }
}