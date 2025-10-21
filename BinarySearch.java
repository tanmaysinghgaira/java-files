public class BinarySearch {
    // Iterative binary search on a sorted array. Returns index or -1 if not found.
    public static int binarySearch(int[] a, int target) {
        int lo = 0, hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] == target) return mid;
            if (a[mid] < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(a, 5)); // 4
        System.out.println(binarySearch(a, 10)); // -1
    }
}
