class Bank{
    public void getRateofInterest(){
        System.out.println("rate of interest");
    }
}
class SBI extends Bank{
    public void getFd(){
        System.out.println("fd details");
    }
    @Override
    public void getRateofInterest(){
        System.out.println("This is overriding");
    }
}

public class overriding {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.getRateofInterest();
        SBI s = new SBI();
        s.getRateofInterest();
        s.getFd();
    }
}
