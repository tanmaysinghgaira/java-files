interface Landvehicel{
     default void land(){
        System.out.println("Driving land vehicle");
     }
}
interface Watervehicel{
    default void water(){
        System.out.println("Driving water vehicel");
    }
}
class Amphibiousvehicel implements Landvehicel,Watervehicel{

    Amphibiousvehicel() {
        System.out.println("THIS IS AMPHIBIOUS VEHICEL");
    }
    
}

public class Multiple {
    public static void main(String[] args) {
        Amphibiousvehicel A = new Amphibiousvehicel();
        A.land();
        A.water();
    }
}
