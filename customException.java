import java.util.Scanner;

class DrivingAgeException extends Exception{
    public void printStackTrace(){
        super.printStackTrace();
    }
    public String  toString(){
        return "The Age for Driving is 18";
    }
    public String getMessage(){
        return "Age for Driving is 18 or above 18 in India";
    }
}

public class customException {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if(age<18){
            try{
                throw new DrivingAgeException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
        System.out.println("Eligible for Driving");
    }
}
