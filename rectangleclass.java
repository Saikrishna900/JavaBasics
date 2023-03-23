//to create a  class rectangle and use getter setter method to set its length breadth and also calculate the area of rectangle and perimeter
class Rectangle{
    private int length;
    private int breadth;

    public void setLength(int length){
        this.length = length;
    }
    public int getLength(){
        return length;
    }
    public void setBreadth(int breadth){
        this.breadth = breadth;
    }
    public int getBreadth(){
        return breadth;
    }
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
public class rectangleclass {
    public static void main(String[] args) {
            Rectangle r1 = new Rectangle();
            r1.setLength(10);
            r1.setBreadth(20);
        System.out.println("area is: "+r1.area());
        System.out.println("perimeter is: "+r1.perimeter());
    }
}
