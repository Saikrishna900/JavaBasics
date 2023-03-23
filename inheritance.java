
class Employee{
    int uid;
    String name;

    public void punch_attendance(int uid,String name){

        System.out.println(uid+" "+name);
    }
}
class Faculty extends Employee{
    String course_name;
    public void teach_course(){

        System.out.println(course_name);
    }
}
public class inheritance {
    public static void main(String[] args) {
        Faculty f = new Faculty();
     f.punch_attendance(27,"sai");
    }
}
