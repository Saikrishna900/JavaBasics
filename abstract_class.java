abstract class Employee1{
    abstract public void salary();
    abstract  public void punch_attendance();
    abstract public void designation();
}
class clerk extends Employee1{

    @Override
    public void salary() {
        System.out.println("Salary is credited");
    }

    @Override
    public void punch_attendance() {
        System.out.println("the attendance of clerk");
    }

    @Override
    public void designation() {
        System.out.println("your role is SDE");
    }
}
public class abstract_class {
    public static void main(String[] args) {
        clerk c = new clerk();
        c.salary();
        c.designation();
        c.punch_attendance();

        modifier m = new modifier();
        m.fun1();
    }
}
