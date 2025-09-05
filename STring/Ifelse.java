public  class Ifelse{
    static  void checkAge(int age){
        if (age<18){
            System.out.println("Access denied - you are not old enough!");
        } else{
            System.out.println("Access granted - your are  old enough! ");

        }
        }
    public static void main(String[]arg){
        checkAge(20);
        checkAge(15);
    }
    }

