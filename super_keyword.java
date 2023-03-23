class A{
    A(){
        System.out.println("A class Constructor");
    }
    A(int x){
        System.out.println("A class parameterized constructor");
    }
}
class B extends A{
    B(){

        System.out.println("B class Constructor");
    }
    B(int x,int y){
        super(20);
        System.out.println("B class parameterized constructor");
    }
}
class C extends B{
    C(){

        System.out.println("C class Constructor");
    }
    C(int x,int y,int z){
        super(10,20);

        System.out.println("C class parameterized constructor");
    }
}
public class super_keyword {
    public static void main(String[] args) {
      C c =new C(10,20,30);

    }
}
