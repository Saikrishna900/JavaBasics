//class AAA{
//    public void show(){
//        System.out.println("Show method in AAA class");
//    }
//}
////class BBB extends AAA{
////    public void show(){
////        System.out.println("show method in BBB class");
////    }
////}
interface AAA{
     void fun1();
     void fun2();
}

public class Anonymousclass {
    public static void main(String[] args) {
        AAA g = new AAA() {
            @Override
            public void fun1() {
                System.out.println("function1 in AAA ");
            }

            @Override
            public void fun2() {
                System.out.println("function2 in AAA ");
            }
        };
        g.fun1();
        g.fun2();
    }
}
