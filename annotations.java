//Annotations:
//It is used to provide extra information about a program.It provides meta data to class or methods
//eg:@override,@functional interface
@FunctionalInterface
interface D{
    void show();
}
class CSE{
    public void CSEClassshowmethod(){
        System.out.println("CSE Class");
    }
}
class EPAM extends CSE{
    @Override
    public void CSEClassshowmethod(){
        System.out.println("EPAM Class");
    }
    @Deprecated
    public void num(){
        int a = 20;
        int b = 10;
        int c;
        c = a+b;
        System.out.println(c);
    }
}
public class annotations {
    @SuppressWarnings({"deprecation","unamed"})
    public static void main(String[] args) {
        EPAM e = new EPAM();
        e.CSEClassshowmethod();
    }
}
