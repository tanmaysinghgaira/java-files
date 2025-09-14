//Calculate the Sum of an Array
public class sum {
    public static void main(String[] args) {

    int [] myarray ={1, 5, 6 ,7};
    int sum =0;
    int i;
     
    //loop thruough the array elements and store the sum in the sum variabel
     
    for ( i =0 ; i<myarray.length;i++){
        sum +=myarray[i];
  
    }
    System.out.println("The Sum is :" + sum);
}}
