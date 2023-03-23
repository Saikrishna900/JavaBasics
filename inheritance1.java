class Vehicle{
    int number;
    String model;
    String color;

    public void vechicle_details(int number,String model,String color){
        System.out.println("vehicle number"+number+"model is : "+model+"color is: "+color);
    }
}
class Car extends Vehicle{
    public void car_price(int price){
        System.out.println("price of a car is: "+price);
    }
}
public class inheritance1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.vechicle_details(2069,"BMW","Blue");
        c.car_price(500000);

    }
}
