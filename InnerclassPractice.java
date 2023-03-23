class Outer1{
    int a = 40;
    private int b=10;
    static int c = 20;

    class Inner1{
        void doingSum(){
            System.out.println("sum is "+(a+b+c));
        }
    }

}

public class InnerclassPractice {
    public static void main(String[] args) {
        Outer1 o1 = new Outer1();
        System.out.println(o1.a);
       Outer1.Inner1 i1 = o1.new Inner1();
       i1.doingSum();
    }
}
