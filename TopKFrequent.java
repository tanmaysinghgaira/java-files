import java.util.*;

public class TopKFrequent {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) count.put(n, count.getOrDefault(n, 0) + 1);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> count.get(a) - count.get(b));
        for (int n : count.keySet()) {
            pq.offer(n);
            if (pq.size() > k) pq.poll();
        }
        int[] res = new int[k];
        for (int i = k-1; i >= 0; i--) res[i] = pq.poll();
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,1,1,2,2,3};
        int[] r = topKFrequent(a, 2);
        System.out.println(Arrays.toString(r)); // [1,2]
    }
}
