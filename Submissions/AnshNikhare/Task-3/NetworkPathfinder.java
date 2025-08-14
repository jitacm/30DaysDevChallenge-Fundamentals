import java.util.*;

public class NetworkPathfinder {

    // Class to represent a weighted edge
    static class Edge {
        String to;
        int weight;

        Edge(String to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    // Graph represented as adjacency list
    static class Graph {
        Map<String, List<Edge>> adj;

        Graph() {
            adj = new HashMap<>();
        }

        void addEdge(String from, String to, int weight) {
            adj.computeIfAbsent(from, k -> new ArrayList<>()).add(new Edge(to, weight));
            adj.putIfAbsent(to, new ArrayList<>()); // Ensure target node exists
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();

        // Build the network
        graph.addEdge("A", "B", 2);
        graph.addEdge("A", "C", 5);
        graph.addEdge("B", "D", 8);
        graph.addEdge("B", "E", 3);
        graph.addEdge("C", "E", 4);
        graph.addEdge("C", "F", 6);
        graph.addEdge("D", null, 0); // D has no outgoing edges
        graph.addEdge("E", "F", 1);
        graph.addEdge("F", null, 0); // F has no outgoing edges

        String start = "A";
        String target = "F";

        // Task 1: BFS - Shortest path in terms of number of hops
        List<String> shortestPath = bfsShortestPath(graph, start, target);
        System.out.println("Shortest path (by hops): " + String.join(" -> ", shortestPath));

        // Task 2: DFS - Find any valid path and calculate total latency
        List<String> dfsPath = dfsFindPath(graph, start, target, new LinkedHashSet<>());
        int totalWeight = calculatePathWeight(graph, dfsPath);
        System.out.println("DFS path found: " + String.join(" -> ", dfsPath));
        System.out.println("Total latency (weight): " + totalWeight);
    }

    // BFS: Find shortest path in terms of number of edges
    public static List<String> bfsShortestPath(Graph graph, String start, String target) {
        Queue<String> queue = new LinkedList<>();
        Queue<List<String>> pathQueue = new LinkedList<>(); // Store path to each node
        Set<String> visited = new HashSet<>();

        queue.add(start);
        pathQueue.add(Arrays.asList(start));
        visited.add(start);

        while (!queue.isEmpty()) {
            String node = queue.poll();
            List<String> path = pathQueue.poll();

            if (node.equals(target)) {
                return path;
            }

            for (Edge edge : graph.adj.getOrDefault(node, Collections.emptyList())) {
                if (edge.to != null && !visited.contains(edge.to)) {
                    visited.add(edge.to);
                    List<String> newPath = new ArrayList<>(path);
                    newPath.add(edge.to);
                    queue.add(edge.to);
                    pathQueue.add(newPath);
                }
            }
        }

        return Collections.emptyList(); // No path found
    }

    // DFS: Find a valid path (first one found) using recursion-style stack
    public static List<String> dfsFindPath(Graph graph, String start, String target, Set<String> visited) {
        if (start == null) return Collections.emptyList();
        visited.add(start);

        if (start.equals(target)) {
            return new ArrayList<>(Arrays.asList(start));
        }

        for (Edge edge : graph.adj.getOrDefault(start, Collections.emptyList())) {
            if (edge.to != null && !visited.contains(edge.to)) {
                List<String> path = dfsFindPath(graph, edge.to, target, visited);
                if (!path.isEmpty()) {
                    path.add(0, start);
                    return path;
                }
            }
        }

        visited.remove(start); // Backtrack
        return Collections.emptyList();
    }

    // Calculate total weight of a path
    public static int calculatePathWeight(Graph graph, List<String> path) {
        if (path.size() < 2) return 0;

        int total = 0;
        for (int i = 0; i < path.size() - 1; i++) {
            String from = path.get(i);
            String to = path.get(i + 1);

            for (Edge edge : graph.adj.getOrDefault(from, Collections.emptyList())) {
                if (edge.to != null && edge.to.equals(to)) {
                    total += edge.weight;
                    break;
                }
            }
        }
        return total;
    }
}
