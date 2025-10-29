package java_aircrafts;

import java.io.PrintStream;

import java_aircrafts.aircrafts.Simulator;
import java_aircrafts.aircrafts.ParsedData;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception{
        PrintStream consoleOut = System.out;
        try (PrintStream fileOut = new PrintStream(new File("simulation.txt"))) {
            System.setOut(fileOut);
            if (args.length != 1)
                throw new Exception("Invalid number of arguments");
            System.out.println("Parsed data " + args[0] + ": ");
            ParsedData data = new ParsedData(args[0]);
            data.print();
            Simulator simulator = new Simulator();
            simulator.run(data);
            System.out.println("THE END");
        } finally { 
            System.setOut(consoleOut);
        }
    }
}