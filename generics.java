import java.util.ArrayList;


class Mygen<G1,G2>{
    int a;
    private G1 g1;
    private G2 g2;

    public Mygen(int a, G1 g1, G2 g2) {
        this.a = a;
        this.g1 = g1;
        this.g2 = g2;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public G1 getG1() {
        return g1;
    }

    public void setG1(G1 g1) {
        this.g1 = g1;
    }

    public G2 getG2() {
        return g2;
    }

    public void setG2(G2 g2) {
        this.g2 = g2;
    }
}
public class generics {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(150);
        System.out.println(a);

        int val = a.get(1);
        System.out.println(val);

        int val1 = a.get(2);
        System.out.println(val1);

        int val2 = a.get(0);
        System.out.println(val2);

        Mygen<String,Integer> gen = new Mygen<>(100,"saikrishna",200);
        System.out.println(gen.getA());
        System.out.println(gen.getG1());
        System.out.println(gen.getG2());
    }
}
