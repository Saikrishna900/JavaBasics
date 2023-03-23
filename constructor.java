class student1{
    int regno,age;
    String name;

    public student1(int regno,int age,String name){
        this.regno=regno;
        this.age = age;
        this.name = name;
    }

    public int getRegno() {
        return regno;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
public class constructor {
    public static void main(String[] args) {
        student1 s1 = new student1(11917851,24,"saikrishna");
        System.out.println(s1.getRegno());
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}
//to calculate the greatest of three numbers using classes and constructors by passing arguements to the constructor(take input of three numbers using scanner class)