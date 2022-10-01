package Project1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A class to represent a Node object
 */

public class Node {
    static ArrayList<String> pathList = new ArrayList<String>();
    private Node parent;
    private String airport_code;
    private String airline_code;
    private String dest_airportCode;
    private int stops;

    public Node(String airportCodes, Object airportCode, Object airlineCode, int stops) {
    }

    public Node(Node Parent, String AirportCode, String AirlineCode, String Dest_airportCode, int Stops) {
        parent = Parent;
        airport_code = AirportCode;
        airline_code = AirlineCode;
        dest_airportCode = Dest_airportCode;
        stops = Stops;
    }

    public Node getParent() {return parent;}
    public String getAirportCode() {
        return airport_code;
    }

    public String getAirlineCode() {
        return airline_code;
    }

    public String getDest_airportCode() {
        return dest_airportCode;
    }

    public int getStops() {
        return stops;
    }

    @Override
    public String toString() {
        return "Node{" +
                "parent='" + parent + '\'' +
                ", airport_code='" + airport_code + '\'' +
                ", airline_code='" + airline_code + '\'' +
                ", stops=" + stops +
                '}';
    }

    public ArrayList<String> solutionPath(){
        ArrayList<String> airportCodesList = new ArrayList<String>();
        ArrayList<String> airlineCodesList = new ArrayList<String>();
        ArrayList<Integer> stopsList = new ArrayList<Integer>();

        Node changingNode = this;

        while (changingNode != null) {
            airportCodesList.add(changingNode.getAirportCode());
            airlineCodesList.add(changingNode.getAirlineCode());
            stopsList.add(changingNode.getStops());

            changingNode = changingNode.parent;
        }
        Collections.reverse(airportCodesList);
        Collections.reverse(airlineCodesList);
        Collections.reverse(stopsList);

        for (int i = 0; i < airportCodesList.size(); i++){
            String solutionStatement = i+1+". "+ airlineCodesList.get(i+1)+"from "+ airportCodesList.get(i)+"to "+
                                        airportCodesList.get(i+1)+stopsList.get(i)+" stops.";

            pathList.add(solutionStatement);
        }
        return pathList;
    }
}