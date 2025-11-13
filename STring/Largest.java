public class Largest {
    public static void main(String[] args) {
        
        int [] number ={45,12,13,34,67}; //initialixe one -dimensional array

        int max = number[0]; //assume the first elemnt is the largest

        //lop through the array starting  from the secod elemnts
        for(int i =1;i<number.length;i++){

            if (number[i] >max){
                 max= number[i];
            }
        }
System.out.println("the largest elements is" + max);
    }
}
