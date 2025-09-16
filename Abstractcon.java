abstract  class Tv{
    abstract void turnOn();
    abstract void turnOff();

}
class TvRemote extends Tv{
    void turnOn(){
        System.out.println("TV IS TURNED ON");
    }
    void turnOff(){
        System.out.println("TV IS TURNED OFF ");
    }
}
public  class Abstractcon{
    public static void main(String[] args) {
        Tv remote = new TvRemote();
        remote.turnOff();
        remote.turnOn();
    }
}