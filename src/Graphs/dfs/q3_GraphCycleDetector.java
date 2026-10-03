package Graphs.dfs;

import java.util.ArrayList;
import java.util.List;

public class q3_GraphCycleDetector {

        // Class representing an undirected graph using an Adjacency List
        static class Graph {
            private final int vertices;
            private final List<List<Integer>> adjList;

            public Graph(int vertices) {
                this.vertices = vertices;
                this.adjList = new ArrayList<>(vertices);
                for (int i = 0; i < vertices; i++) {
                    adjList.add(new ArrayList<>());
                }
            }

            // Add an undirected edge
            public void addEdge(int src, int dest) {
                adjList.get(src).add(dest);
                adjList.get(dest).add(src);
            }

            // Main method to check for cycles across all components
            public boolean hasCycle() {
                boolean[] visited = new boolean[vertices];

                // Loop handles disconnected graphs/multiple components
                for (int i = 0; i < vertices; i++) {
                    if (!visited[i]) {
                        if (dfsCheck(i, -1, visited)) {
                            return true;
                        }
                    }
                }
                return false;
            }

            // Helper recursive DFS function
            private boolean dfsCheck(int current, int parent, boolean[] visited) {
                visited[current] = true;

                // Go through all adjacent neighbors
                for (int neighbor : adjList.get(current)) {

                    // If neighbor is not visited, recurse into it
                    if (!visited[neighbor]) {
                        if (dfsCheck(neighbor, current, visited)) {
                            return true;
                        }
                    }
                    // If neighbor is visited and it's NOT the direct parent, a cycle exists
                    else if (neighbor != parent) {
                        return true;
                    }
                }
                return false;
            }
        }

        // Driver code to test the implementation
        public static void main(String[] args) {
            // Example 1: Graph with a cycle
            Graph g1 = new Graph(4);
            g1.addEdge(0, 1);
            g1.addEdge(1, 2);
            g1.addEdge(2, 3);
            g1.addEdge(3, 0); // This edge creates the cycle 0-1-2-3-0

            System.out.println("Graph 1 has cycle? " + g1.hasCycle()); // Output: true

            // Example 2: Graph without a cycle (A simple tree structure)
            Graph g2 = new Graph(4);
            g2.addEdge(0, 1);
            g2.addEdge(1, 2);
            g2.addEdge(1, 3);

            System.out.println("Graph 2 has cycle? " + g2.hasCycle()); // Output: false
        }
    }
