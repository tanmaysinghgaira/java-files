public class Mover {

    public int add (int a,  int b){
        return a + b;

    }
    public double add(double a ,double b){
        return a + b;
    }
    public int add( int a,int b, int c){
        return a +b + c;
    }
    public  float add(float a,float b ){
        return a + b;
    }
    public  static void main(String[]arg){
        Mover obj = new Mover();
        System.out.println(obj.add(5,6));
        System.out.println(obj.add(5.5,6.6));
        System.out.println(obj.add(7,7,7));
        System.out.println(obj.add( 7.7f,8.8f));
    }
}
