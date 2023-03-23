interface A1{
    int a =10;
    int b= 20;
    void calculate();
    void display();
}

interface C1{
    void show();
}

class B1 implements A1,C1{

    int c;
    @Override
    public void calculate() {
        c =a+b;
    }

    @Override
    public void display() {
        System.out.println("The output is: "+c);
    }

    @Override
    public void show() {
        System.out.println("output of c");
    }
}
public class Interface {
    public static void main(String[] args) {
        B1 b = new B1();
        b.calculate();
        b.display();
        b.show();
    }
}
