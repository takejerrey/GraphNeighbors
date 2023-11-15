import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Graph graph = new Graph();
        // Creating a graph with 5 vertices
        int V = 9;
        ArrayList<ArrayList<Character>> adj
                = new ArrayList<ArrayList<Character> >(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Character>());

        // Adding edges of Vertex A
        graph.addEdge(adj,0,1);
        graph.addEdge(adj,0,3);
        graph.addEdge(adj,0,4);

        // Adding edges of Vertex B
        graph.addEdge(adj,1,4);

        // Adding edges of Vertex C
        graph.addEdge(adj,2,1);

        // Adding edges of Vertex D
        graph.addEdge(adj,3,6);

        // Adding edges of Vertex E
        graph.addEdge(adj,4,5);
        graph.addEdge(adj,4,7);

        // Adding edges of Vertex F
        graph.addEdge(adj,5,7);
        graph.addEdge(adj,5,2);

        // Adding edges of Vertex G
        graph.addEdge(adj,6,7);

        // Adding edges of Vertex H
        graph.addEdge(adj,7,8);

        // Adding edges of Vertex I
        graph.addEdge(adj,8,5);

        // The following are output for the neighbors of a vertex.
        // " Character[] neighbors = graph.getNeighbors(...)" is the method call to return an array of neighbors
        System.out.print("Neighbors of A: ");
        Character[] neighbors = graph.getNeighbors(adj,0);
        for(int i = 0; i < neighbors.length;i++){
            if(neighbors[i]!=null) {
                System.out.print(neighbors[i] + " ");
            }
        }
        System.out.print("\nNeighbors of B: ");
       neighbors = graph.getNeighbors(adj,1);
        for(int i = 0; i < neighbors.length;i++){
            if(neighbors[i]!=null) {
                System.out.print(neighbors[i] + " ");
            }
        }

        System.out.print("\nNeighbors of C: ");
        neighbors = graph.getNeighbors(adj,2);
        for(int i = 0; i < neighbors.length;i++){
            if(neighbors[i]!=null) {
                System.out.print(neighbors[i] + " ");
            }
        }

        System.out.print("\nNeighbors of D: ");
        neighbors = graph.getNeighbors(adj,3);
        for(int i = 0; i < neighbors.length;i++){
            if(neighbors[i]!=null) {
                System.out.print(neighbors[i] + " ");
            }
        }

        System.out.print("\nNeighbors of E: ");
        neighbors = graph.getNeighbors(adj,4);
        for(int i = 0; i < neighbors.length;i++){
            if(neighbors[i]!=null) {
                System.out.print(neighbors[i] + " ");
            }
        }

        System.out.print("\nNeighbors of F: ");
        neighbors = graph.getNeighbors(adj,5);
        for(int i = 0; i < neighbors.length;i++){
            if(neighbors[i]!=null) {
                System.out.print(neighbors[i] + " ");
            }
        }

        System.out.print("\nNeighbors of G: ");
        neighbors = graph.getNeighbors(adj,6);
        for(int i = 0; i < neighbors.length;i++){
            if(neighbors[i]!=null) {
                System.out.print(neighbors[i] + " ");
            }
        }

        System.out.print("\nNeighbors of H: ");
        neighbors = graph.getNeighbors(adj,7);
        for(int i = 0; i < neighbors.length;i++){
            if(neighbors[i]!=null) {
                System.out.print(neighbors[i] + " ");
            }
        }

        System.out.print("\nNeighbors of I: ");
        neighbors = graph.getNeighbors(adj,8);
        for(int i = 0; i < neighbors.length;i++){
            if(neighbors[i]!=null) {
                System.out.print(neighbors[i] + " ");
            }
        }
    }
}