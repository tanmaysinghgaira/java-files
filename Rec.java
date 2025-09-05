


public class Rec {
    /*Recursion is the technique of making a
    function call itself. This technique provides a
    way to break complicated problems down
    into simpler problems which are easier
    to solve.
Recursion may be a bit difficult
to understand. The best way to figure
out how it works is to experiment with it.*/
public static int sum(int k){
    if (k>0){
        return k  + sum (k-1);
    }
    else{
        return 0;
    }
}
public static void main(String[] args) {
    int result = sum(5);
    System.out.println(result);
}
}
