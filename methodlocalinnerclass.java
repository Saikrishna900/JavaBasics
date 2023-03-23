class Outer2{
    public void outMethod(){
        System.out.println("outer class Method");
        class Inner2{
            public void innerMethod(){
                System.out.println("Inner class Method");
            }
        }
        Inner2 i = new Inner2();
        i.innerMethod();
    }
}

public class methodlocalinnerclass {
    public static void main(String[] args) {
        Outer2 o = new Outer2();
        o.outMethod();
    }
}
