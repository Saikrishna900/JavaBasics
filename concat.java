public class concat {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("CSE");
        s.append("course");
        s.append("epam");
        System.out.println(s);
       s.setCharAt(1,'c');
        System.out.println(s);
        s.insert(1,'i');
        System.out.println(s);
    }
}
