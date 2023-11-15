import java.util.*;

class Graph {

    // Function to add an edge into a linked graph
    static void addEdge(ArrayList<ArrayList<Character>> adj, int u, int v)
    {
        adj.get(u).add((char) (v+65));
    }

    // Function to find the neighbors of a vertex in the linked graph
    public Character[] getNeighbors(ArrayList<ArrayList<Character>> adj, int u) {
        ArrayList<Character> neighbors = adj.get(u);
        Character[] result = new Character[neighbors.size()];
        for (int i = 0; i < neighbors.size(); i++) {
            result[i] = neighbors.get(i);
        }
        return result;
    }
}