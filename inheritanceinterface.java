interface A2{
    void fun1();
    void fun2();
}

interface B2 extends A2{
    void fun3();
    void fun4();
}

class Sample implements B2{

    @Override
    public void fun1() {
        System.out.println("function 1");
    }

    @Override
    public void fun2() {
        System.out.println("function 2");
    }

    @Override
    public void fun3() {
        System.out.println("function 3");
    }

    @Override
    public void fun4() {
        System.out.println("function 4");
    }
}
public class inheritanceinterface {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.fun1();
        s.fun2();
        s.fun3();
        s.fun4();
    }
}
