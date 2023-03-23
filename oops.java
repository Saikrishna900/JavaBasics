
class Student {
    private int regno;
    private int rollno;
    private String name;


    public void setRegno(int regno){
         this.regno=regno;
     }
     public int getRegno(){
         return regno;
     }
     public void setRollno(int rollno){
         this.rollno=rollno;
     }
     public int getRollno(){
         return rollno;
     }
     public void setName(String name){
         this.name=name;
     }
     public String getName(){
         return name;
     }
}
public class oops {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRegno(11917851);
        System.out.println(s1.getRegno());

    }
}
