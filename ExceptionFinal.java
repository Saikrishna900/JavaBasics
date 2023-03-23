

public class ExceptionFinal {
    public static void main(String[] args) {

        int a = 20;
        int b = 4;
        try{
            int c=a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Exception occured");
        }
        finally {
            System.out.println("I am in finally block");
        }
        System.out.println("done");
    }
}
