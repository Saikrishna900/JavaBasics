//crete an interface Tv remote and used to inherit an interface smart Tv remote. create a class Tv which implements Tv remote interface
interface  TvRemote1{
    void on();
    void off();
    void increasevolume();
    void decresevolume();
}

interface SmartTvRemote extends TvRemote1{
    void on();
    void changeChannel();
    void playmusic();
    void playNetflix();
}
class Tv1 implements TvRemote1{

    @Override
    public void on() {
        System.out.println("turn on the Tv");
    }

    @Override
    public void off() {
        System.out.println("turn off the Tv");
    }

    @Override
    public void increasevolume() {
        System.out.println("increase the volume");
    }

    @Override
    public void decresevolume() {
        System.out.println("decrease the volume");
    }
}
public class Tv {
    public static void main(String[] args) {
        Tv1 t = new Tv1();
        t.on();
        t.off();
        t.increasevolume();
        t.decresevolume();
    }
}
