//interface methods
interface  client{
    void webdesign();
    void webdevelopment();
}
abstract  class tech implements client{
      public void webdesign(){
        System.out.println("This is webdesign method");
    }
}
 class rtech extends tech {
      public void webdevelopment(){
        System.out.println("This is devlopmenyt method");
    }
}
public class Interfacemeth {
    public static void main(String[] args) {
        rtech obj = new rtech();
        obj.webdesign();
        obj.webdevelopment();
    }
}
