package Project1;

/**
 * A class to represent a Node object
 */

public class Node {
    private Node parent;
    private String airport_code;
    private String airline_code;
    private int stops;

    public Node() {

    }
    
    public Node getParent() {
        return parent;
    }

    public Node(Node Parent, String AirportCode, String AirlineCode, int Stops) {
        Parent = parent;
        AirportCode = airport_code;
        AirlineCode = airline_code;
        Stops = stops;
    }

    public String getAirportCode() {
        return airport_code;
    }

    public String getAirlineCode() {
        return airline_code;
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
}