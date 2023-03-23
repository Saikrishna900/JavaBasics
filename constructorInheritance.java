
class Base{
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Base() {
        System.out.println("constructor of base class");
    }
}

class Derived extends Base{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Derived() {
        System.out.println("constructor of Derived class");
    }
}
class DerivedChild extends Derived{

}
public class constructorInheritance {
    public static void main(String[] args) {
        //Base b = new Base();
        Derived d = new Derived();

    }
}
