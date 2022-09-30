package Project1;

/**
 * @author Ann-Vanessa Lartey
 */

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class main {

    public static void bfs() {
        System.out.println("Performing a Breadth First Search");

        Node node = new Node();
        // Queue - frontier
        // hashset - explored set
        Queue<Node> frontier = new LinkedList<Node>();
        HashSet<String> exploredSet = new HashSet<String>();

        while (frontier.size() > 0) {
            node = frontier.remove();
            exploredSet.add(node.getAirportCode());
            System.out.println("Removed: " + node.getAirportCode());
        }
    }
}

