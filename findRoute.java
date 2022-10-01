package Project1;


import java.io.FileNotFoundException;
import java.util.*;
import static Project1.readFiles.*;
import static Project1.Node.*;
import static Project1.Routes.*;

public class findRoute {

    public static ArrayList<String> breadthFirstSearch(String start_state, String goal_state) throws FileNotFoundException {
        System.out.println("Performing Breadth First Search");

        Queue<Node> frontierQueue = new LinkedList<>();
        HashSet<String> exploredSet = new HashSet<String>();

        HashMap<String, ArrayList<String>> general_map = readAirlineFile();
        ArrayList<String> airportCodes_List = general_map.get(start_state);

        // looping through the airport codes
        for (String airportCodes: airportCodes_List) {
            frontierQueue.add(new Node(airportCodes, null, null, 0));

            while (frontierQueue.size() > 0) {
                Node stateNode = frontierQueue.remove();
                exploredSet.add(stateNode.getAirportCode());
                System.out.println("Popped node" + stateNode);

                ArrayList<String> actions = start_destMap.get(stateNode.getAirportCode());

                for (String action: actions) {
                    Node child_nodeObj = new Node(stateNode, action.getDest_airportCode(), action.getAirlineCode(), action.getStops());
                    String returnedCity = airportMap.get(child_nodeObj);
                    if (returnedCity.equals(goal_state))
                        return child_nodeObj.solutionPath();
                    frontierQueue.add(child_nodeObj);
                }
            }
        }
        return null;
    }
}
