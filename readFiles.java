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

    public static HashMap<String, Airports> readAirportFile() throws FileNotFoundException{

        Scanner airportData;
        airportData = new Scanner(new File("C:\\Users\\HP\\IdeaProjects\\Individual Project\\airports.csv"));

        HashMap<String, Airports> airportMap = new HashMap<String, Airports>();
        HashMap<String, String[]> airportMap2 = new HashMap<String, String[]>();
        //String[] airportValue = new String[3];


        while (airportData.hasNext()) {
            String[] airportArray = airportData.nextLine().split(",");
            String[] airportArray2 = new String[3];
            airportArray2[0] = airportArray[1];
            airportArray2[1] = airportArray[6];
            airportArray2[2] = airportArray[7];

            try {
                if (airportArray.length == 14) {
                    Airports airportObj = new Airports(airportArray[0], airportArray[1], airportArray[2],
                            airportArray[3], airportArray[4], airportArray[5],
                            (Double.parseDouble(airportArray[6])), (Double.parseDouble(airportArray[7])), airportArray[8],
                            airportArray[9], airportArray[10], airportArray[11], airportArray[12], airportArray[13]);
                    airportMap.put(airportArray[0], airportObj);

                }
                else{
                    Airports airportObj = new Airports(airportArray[0], (airportArray[1] + airportArray[2]),
                            airportArray[3], airportArray[4], airportArray[5], airportArray[6],
                            (Double.parseDouble(airportArray[7])), (Double.parseDouble(airportArray[8])), airportArray[9],
                            airportArray[10], airportArray[11], airportArray[12], airportArray[13], airportArray[14]);
                    airportMap.put(airportArray[0], airportObj);
                }
            }catch(NumberFormatException ne){
                System.out.println("Encountered Problem"+ ne.getMessage());
            }

            airportMap2.put(airportArray[2]+", "+airportArray[3], airportArray2);
        }
        airportData.close();
        return airportMap;

    }
    public static HashMap<String, Airlines> readAirlineFile() throws FileNotFoundException{

        Scanner airlineData;
        airlineData = new Scanner(new File("C:\\Users\\HP\\IdeaProjects\\Individual Project\\airlines.csv"));

        HashMap<String, Airlines> airlineMap = new HashMap<String, Airlines>();

        while (airlineData.hasNext()) {
            String[] airlineArray = airlineData.nextLine().split(",");

            Airlines airlineObj = new Airlines(Integer.parseInt(airlineArray[0]), airlineArray[1], airlineArray[2],
                    airlineArray[3], airlineArray[4], airlineArray[5],
                    (airlineArray[6]), (airlineArray[7]));

            airlineMap.put(airlineArray[0], airlineObj);

        }
        airlineData.close();
        return airlineMap;
    }

    public static HashMap<String, ArrayList<String>> readRouteFile() throws FileNotFoundException {

        HashMap<String, String[]> routeMap = new HashMap<>();

        ArrayList<String> destination = new ArrayList<String>();
        HashMap<String, ArrayList<String>> start_destMap = new HashMap<String, ArrayList<String>>();

        Scanner routeData;
        routeData = new Scanner(new File("C:\\Users\\HP\\IdeaProjects\\Individual Project\\routes.csv"));

        while (routeData.hasNext()) {
            String[] routeArray = routeData.nextLine().split(",");

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
