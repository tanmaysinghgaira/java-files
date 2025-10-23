import java.util.*;

public class MinStack {
    private Deque<Integer> stack = new ArrayDeque<>();
    private Deque<Integer> mins = new ArrayDeque<>();

    public void push(int x) {
        stack.push(x);
        if (mins.isEmpty() || x <= mins.peek()) mins.push(x);
    }

    public int pop() {
        int v = stack.pop();
        if (v == mins.peek()) mins.pop();
        return v;
    }

    public int top() { return stack.peek(); }

    public int getMin() { return mins.peek(); }

    public static void main(String[] args) {
        MinStack s = new MinStack();
        s.push(-2); s.push(0); s.push(-3);
        System.out.println(s.getMin()); // -3
        s.pop();
        System.out.println(s.top()); // 0
        System.out.println(s.getMin()); // -2
    }
}
