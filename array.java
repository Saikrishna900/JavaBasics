import java.util.Scanner;

public class array {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
      int [] cgpa =new int[10];
      int sum=0;
      for(int i=0;i< cgpa.length;i++){
          cgpa[i] = sc.nextInt();
          sum+=cgpa[i];
      }
      System.out.println(sum);

    }
}
