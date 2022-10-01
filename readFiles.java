package Project1;
/**
 * A class to read the Airports, Airlines and Routes csv files
 */

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class readFiles {
    static String[] airportArray = new String[14];
    static HashMap<String, String> airportMap = new HashMap<String, String>();
    static HashMap<String, ArrayList<String>> start_destMap = new HashMap<String, ArrayList<String>>();
    static ArrayList<Routes> pathList = new ArrayList<>();

    public static HashMap<String, String> readAirportFile() throws FileNotFoundException {

        Scanner airportData;
        airportData = new Scanner(new File("C:\\Users\\HP\\IdeaProjects\\Individual Project\\airports.csv"));

        HashMap<String, String> airportMap = new HashMap<String, String>();
        //HashMap<String, Airports> airports = new HashMap<String, Airports>();

        while (airportData.hasNext()) {
            String[] airportArray = airportData.nextLine().split(",");
            try{
                if (airportArray.length == 14) {
                    String location = airportArray[2]+","+ airportArray[3];
                    airportMap.put(location, airportArray[4]);
                } else{
                    String adj_location = airportArray[2]+","+ airportArray[3]+","+ airportArray[4];
                    airportMap.put(adj_location, airportArray[5]);
                }
            } catch (NumberFormatException ne) {
                System.out.println("Encountered Error: "+ ne.getMessage());
            }
        }
        airportData.close();
        System.out.println(airportMap);
        return airportMap;

    }
    public static HashMap<String, ArrayList<String>> readAirlineFile() throws FileNotFoundException{

        Scanner airlineData;
        airlineData = new Scanner(new File("C:\\Users\\HP\\IdeaProjects\\Individual Project\\airlines.csv"));

        HashMap<String, ArrayList<String>> airlineMap = new HashMap<>();

        while (airlineData.hasNext()) {
            String[] airlineArray = airlineData.nextLine().split(",");

            String ID = airlineArray[0];
            ArrayList<String> airlineDetails = new ArrayList<String>();
            airlineDetails.add(airlineArray[1]);
            airlineDetails.add(airlineArray[2]);
            airlineDetails.add(airlineArray[3]);
            airlineDetails.add(airlineArray[4]);
            airlineDetails.add(airlineArray[5]);
            airlineDetails.add(airlineArray[6]);
            airlineDetails.add(airlineArray[7]);

            airlineMap.put(ID, airlineDetails);

        }
        airlineData.close();
        System.out.println(airlineMap);

        return airlineMap;
    }

    public static HashMap<String, ArrayList<String>> readRouteFile() throws FileNotFoundException {

        HashMap<String, ArrayList<Routes>> routes = new HashMap<>();
        ArrayList<String> destination = new ArrayList<String>();
        ArrayList<Routes> routeList;
        HashMap<String, ArrayList<String>> start_destMap = new HashMap<String, ArrayList<String>>();

        Scanner routeData;
        routeData = new Scanner(new File("C:\\Users\\HP\\IdeaProjects\\Individual Project\\routes.csv"));

        while (routeData.hasNext()) {
            String[] routeArray = routeData.nextLine().split(",");

            Routes routeObj = new Routes(routeArray[0], routeArray[1], routeArray[4], Integer.parseInt(routeArray[7]));

            // Ensuring the key is not present in the hashmap
            routeList = routes.get(routeArray);
            if (routeList == null) {
                ArrayList<Routes> pathList = new ArrayList<>();
                pathList.add(routeObj);
                routes.put(routeArray[2], pathList);
            } else {
                routeList.add(routeObj);
                routes.put(routeArray[2], routeList);
            }

            start_destMap.put(airportArray[0], destination);
            if (start_destMap.containsKey(routeArray[3])){
                start_destMap.get(routeArray[3]).add(routeArray[5]);
            } else {
                destination = new ArrayList<String>();
                destination.add(routeArray[5]);
                start_destMap.put(routeArray[3], destination);
            }
        }
        System.out.print(start_destMap);
        routeData.close();
        return start_destMap;
    }

    public static void main(String[] args) throws FileNotFoundException {
        readAirportFile();
        readAirlineFile();
        readRouteFile();
    }
}
