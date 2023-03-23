import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter courses: ");
        String courses = sc.nextLine();

        String s1 = new String("Epaml class");
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.trim());
        System.out.println(s1.substring(3,8));
        System.out.println(s1.replace('a','n'));
        System.out.println(s1.replace("al","qq"));
        System.out.println(s1.startsWith("E"));
        System.out.println(s1.endsWith("sq"));
        //charAt is it return character when given index
        System.out.println(s1.charAt(2));
        //indexOf it returns the index of the given state
        System.out.println(s1.indexOf("am"));
        System.out.println(s1.indexOf('a',1));
        //last IndexOf -- it will start from last
        System.out.println(s1.lastIndexOf('a'));
        System.out.println(s1.lastIndexOf('l',5));
        //equals
        //equals ignore case
        //contains
        System.out.println(s1.contains("y"));
        //split
        String ca1[] = courses.split(",");
        for(String x: ca1){
            System.out.println(x);
        }

    }
}
