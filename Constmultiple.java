//You can have as many parameters as you want:
public class Constmultiple {
    int modelYear;
    String modelname;
    int price;
    public Constmultiple( int year ,String name,int pric){

        modelYear = year;
        modelname = name;
        price =pric;
    }
    public static void main(String[] args) {
        Constmultiple c= new Constmultiple(2007,"Hunter",70000);
        System.out.println( ""+c.modelname + " " + c.price +" "+ c.modelYear);
    }
    
}
