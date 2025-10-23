import java.util.*;

public class GraphBFS {
    public static void bfs(Map<Integer, List<Integer>> graph, int start) {
        Set<Integer> seen = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(start); seen.add(start);
        while (!q.isEmpty()) {
            int cur = q.poll();
            System.out.print(cur + " ");
            for (int nei : graph.getOrDefault(cur, Collections.emptyList())) {
                if (!seen.contains(nei)) { seen.add(nei); q.add(nei); }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> g = new HashMap<>();
        g.put(1, Arrays.asList(2,3));
        g.put(2, Arrays.asList(4));
        g.put(3, Arrays.asList(5));
        bfs(g, 1); // 1 2 3 4 5
    }
}
