// Program to demonstrate try and catch in Java
public class Tryandcatch {
	public static void main(String[] args) {
		try {
			int[] arr = {1, 2, 3};
			System.out.println("Element at index 5: " + arr[5]); // This will throw ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught: " + e);
		}
		System.out.println("Program continues after try-catch block.");
	}
}
