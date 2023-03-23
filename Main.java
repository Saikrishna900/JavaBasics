import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*String str1 = "epam";
        String str2 = "epam";
        String str3 = new String("epam");
        if (str1 == str2) {
            System.out.println(str1.equals(str2));
            System.out.println(str1==str2);
            System.out.println(str1.equals(str3));
            System.out.println(str1==str3);*/
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Cgpa: ");
        int cgpa = sc.nextInt();
        if(cgpa>9){
            System.out.println("O Grade");
        }
        else if(cgpa>8 && cgpa<=9){
            System.out.println("A Grade");
        }
        else if(cgpa>7 && cgpa<=8){
            System.out.println("B Grade");
        }
        else{
            System.out.println("D Grade");
        }
    }
}