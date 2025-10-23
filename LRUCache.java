import java.util.*;

public class LRUCache {
    private final int capacity;
    private final Map<Integer, Integer> map;
    private final Deque<Integer> deque;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.deque = new LinkedList<>();
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        deque.remove(key);
        deque.addFirst(key);
        return map.get(key);
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            deque.remove(key);
        } else if (map.size() == capacity) {
            int lru = deque.removeLast();
            map.remove(lru);
        }
        map.put(key, value);
        deque.addFirst(key);
    }

    public static void main(String[] args) {
        LRUCache c = new LRUCache(2);
        c.put(1,1);
        c.put(2,2);
        System.out.println(c.get(1)); // 1
        c.put(3,3);
        System.out.println(c.get(2)); // -1
    }
}
