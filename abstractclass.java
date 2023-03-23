abstract class ElectricRemoteControl{
    public void turn_on(){
        System.out.println("turn on the Elelctric Appliance");
    }
    abstract public void change_button();
}
 class TvRemote extends ElectricRemoteControl{
     @Override
     public void change_button() {

         System.out.println("button is working");
     }
 }
public class abstractclass {
    public static void main(String[] args) {
        TvRemote t = new TvRemote();
        t.change_button();
    }
}
