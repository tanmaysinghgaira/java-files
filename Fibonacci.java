public class Fibonacci {
    // Iterative fibonacci (returns n-th number, 0-indexed)
    public static long fib(int n) {
        if (n <= 1) return n;
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
    }
}
