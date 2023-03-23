class Phone1{
    public void call(){
        System.out.println("calling from phone");
    }
    public void setAlarm1(){

        System.out.println("Alarm is coming");
    }
}
interface camera{
    void taking_photo();
    void deleting_photo();
    default void zoom(){
        System.out.println("camera is zooming");
    }
}
interface musicplayer{
    void playmusic();
    void pausemusic();
}
class SmartPhone1 extends Phone1 implements camera,musicplayer{
    public void screenRecording(){

        System.out.println("recording screen");
    }
    public void downloadingApps(){
        System.out.println("downloading apps from smartphone");
}

    @Override
    public void taking_photo() {
        System.out.println("taking photo using camera");
    }

    @Override
    public void deleting_photo() {
        System.out.println("deleting photo from photos");
    }

    @Override
    public void playmusic() {
        System.out.println("playing music");
    }

    @Override
    public void pausemusic() {
        System.out.println("pause the music");
    }
}
public class interfaceclass {
    public static void main(String[] args) {
        SmartPhone1 s = new SmartPhone1();
        s.call();
        s.setAlarm1();
        s.downloadingApps();
        s.screenRecording();
        s.taking_photo();
        s.deleting_photo();
        s.playmusic();
        s.pausemusic();
        s.zoom();
    }
}
//write a program to enter weight and height of 5persons .calculate the count of those persons less than 60kgs weight and height is greater than 5.5
//write a program to make two classes one super and sub class.sub class constructor assests five arguments and sent three arguments to super class.super class calculates greatest of three numbers and sub class calculate average of 5 members