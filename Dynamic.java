class Phone{
    public void call(){
        System.out.println("calling from phone");
    }
    public void downloadingApps(){
        System.out.println("app is downloading");
    }
    public void setAlarm(){
        System.out.println("Alarm is coming");
    }
}
class SmartPhone extends Phone{
    public void screenRecording(){
        System.out.println("recording screen");
    }

}
public class Dynamic {
    public static void main(String[] args) {
SmartPhone p = new SmartPhone();


p.call();
p.downloadingApps();
    }
}
