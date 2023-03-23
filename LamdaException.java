interface DemoInt{
//    void show(String u);
    void a(int num1,int num2);
}

public class LamdaException {
    public static void main(String[] args) {
        //functional interface(Which is having one method)
        //lamda expression provides a clear and consized way to represent one method interface using an expression
        //the lamda expression is used to provide the implementation of an interface which has functional interface
        //in case of lamda expression we do not need for providing the implementation.Here we just write the implementation code
//    DemoInt d = (u)->{
//        System.out.println("hi "+u);};
//        d.show("priya");
        DemoInt d = (a,b)->{
            System.out.println(a*b);
        };
        d.a(20,50);
//
//
    }
}
