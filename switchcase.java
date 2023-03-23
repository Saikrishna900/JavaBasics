import java.util.Scanner;

public class switchcase {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter month: ");
        String month = sc.nextLine();
        switch (month){
            case "Jan":
            case "Feb":
            case "Mar":
                System.out.println("Semester-1");
                break;
            case "Apr":
            case "May":
            case "Jun":
                System.out.println("Semester-2");
                break;
            case "July":
            case "Aug":
            case "Sep":
                System.out.println("Semester-3");
                break;
            case "Oct":
            case "Nov":
            case "Dec":
                System.out.println("Semester-4");
                break;
            default:
                System.out.println("Enter a valid month!!");
                break;
        }


    }
}
