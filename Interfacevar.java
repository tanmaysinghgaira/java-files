//interface variable
interface  cutomer
{
    int amt =5;
    void purchase();
}
class seller implements cutomer{
    
    public void purchase(){
        //AMOUNT IS FINAL AND STATIC BY DEFAULT
       // The final field cutomer.amt cannot be assigned
        System.out.println("YOU NEED "+amt+"kg OF RICE" );
    }
}
class Interfacevar{
    public static void main(String[] args) {
        seller obj = new seller();
        obj.purchase();
    }

}