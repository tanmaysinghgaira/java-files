public class ReverseString {
    public static String reverse(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++; j--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverse(s)); // olleh
    }
}
