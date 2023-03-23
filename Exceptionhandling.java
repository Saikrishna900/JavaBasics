/*There are three types of errors in java
1. syntax error
2. logical error
3. runtime error
Exception in java: exception is an event that occurs when an program executed and disrupting the normal flow of instruction
commonly occuring exception
1.null pointer exception
2.arithmetic exception
3. ArrayIndexOutofBound exception
4.NumberFormat exception
5.IllegalArgument exception
6.Custom Exception
we can create our own exception using exception class in java
syntax:class mynewexception extends Exception{
    //overridden method
}

the exception class have following important methods
1.String to String()
2.get mesaage
3.print stack trace
Throw : it is used to an exception explicitly by the programer

which is always executed whether exception is handled or not
it is used to execute the code containing the instructions to release the system resources closing the connection
and so on....*/
import java.util.Scanner;

public class Exceptionhandling {
    public static void main(String[] args) {
//        int a = 5;
//        int b=0;
//
//        try{
//            System.out.println(a/b);
//        }
//        catch (ArithmeticException r){
//            System.out.println("Arithmetic Exception occured");
//            System.out.println(r);
//        }
//        //always remember exception will be last
//        catch (Exception e){
//            System.out.println("Exception occured");
//            System.out.println(e);
//        }
//    }
//}
        //write a program to ask the index for an array from the user and also ask the number with which you will divide
        //the corresponding number accessed by the index.catch the exception .
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];



        try {
            for (int i = 0; i <= a.length; i++) {
                System.out.println("Enter the number for array index : ");
                a[i] = sc.nextInt();
            }
            System.out.println("Enter a number to divide the array elements by: ");
            int number = sc.nextInt();

            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i] / number);
            }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException r) {
            System.out.println("ArrayIndexOutOfBounds exception occurred");
            System.out.println(r);
        } catch (Exception g) {
            System.out.println("Exception occurred");
            System.out.println(g);
        }
    }
}