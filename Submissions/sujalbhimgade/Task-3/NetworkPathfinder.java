import java.util.*;

public class NetworkPathfinder {

    public static void main(String[] args) {
        Map<String, Map<String, Integer>> network = new HashMap<>();

        Map<String, Integer> aLinks = new HashMap<>();
        aLinks.put("B", 2);
        aLinks.put("C", 5);
        network.put("A", aLinks);

        Map<String, Integer> bLinks = new HashMap<>();
        bLinks.put("D", 8);
        bLinks.put("E", 3);
        network.put("B", bLinks);

        network.put("C", Map.of("E", 4, "F", 6));
        network.put("D", Map.of());
        network.put("E", Map.of("F", 1));
        network.put("F", Map.of());

        System.out.println("=== Network Path Finder ===");

        List<String> pathByHops = findPathByHops(network, "A", "F");
        System.out.println("\nPath with fewest hops: " + pathByHops);
        System.out.println("Total hops: " + (pathByHops.size() - 1));

        PathResult weightedPath = findWeightedPath(network, "A", "F");
        System.out.println("\nExample weighted path: " + weightedPath.path);
        System.out.println("Total latency: " + weightedPath.totalLatency + "ms");
    }

    static List<String> findPathByHops(Map<String, Map<String, Integer>> network, String start, String end) {
        Queue<List<String>> queue = new LinkedList<>();
        queue.add(Arrays.asList(start));

        while (!queue.isEmpty()) {
            List<String> path = queue.poll();
            String last = path.get(path.size() - 1);

            if (last.equals(end)) return path;

            for (String neighbor : network.getOrDefault(last, Collections.emptyMap()).keySet()) {
                List<String> newPath = new ArrayList<>(path);
                newPath.add(neighbor);
                queue.add(newPath);
            }
        }

        return Collections.emptyList();
    }

    static PathResult findWeightedPath(Map<String, Map<String, Integer>> network, String start, String end) {
        Stack<PathResult> stack = new Stack<>();
        stack.push(new PathResult(Arrays.asList(start), 0));

        while (!stack.isEmpty()) {
            PathResult current = stack.pop();
            String last = current.path.get(current.path.size() - 1);

            if (last.equals(end)) return current;

            for (Map.Entry<String, Integer> neighbor : network.getOrDefault(last, Collections.emptyMap()).entrySet()) {
                List<String> newPath = new ArrayList<>(current.path);
                newPath.add(neighbor.getKey());
                int total = current.totalLatency + neighbor.getValue();
                stack.push(new PathResult(newPath, total));
            }
        }

        return new PathResult(Collections.emptyList(), 0);
    }

    static class PathResult {
        List<String> path;
        int totalLatency;

        PathResult(List<String> path, int totalLatency) {
            this.path = path;
            this.totalLatency = totalLatency;
        }
    }
}
