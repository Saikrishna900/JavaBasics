class outer{
    static int a =5;
    public static void show(){
        System.out.println("display");
    }
    static class inner{
        public inner() {
            System.out.println("inner class");
        }

        public void display(){
            System.out.println("ok");
            System.out.println(a);
        }
    }
}

public class nestedclass {
    public static void main(String[] args) {
        //in java methods , variables of a class we can have another class as it member
        //the class return within is called nested class
        //the class that holds the inner class is called the outer class
        //types:
        //1.Inner class:
        //1.1 Non static inner class:
        //if the inner class is non static to make an object of inner class you need to make an object of outer class as well
        //1.2 method local inner class:
        //inner class can be declared within a method of an outer class
        //1.3 Anonymous inner class:
        //Anonymous classes enable to make your code more consent.
        // They are like local classes except that it don't have name.
        // use them if you need to use a local class only once.
        //2.static nested class:
        //static nested class can access outer class static variables
        //it cannot access non outer class non static variables and methods
        //synatx to create an object of static inner class is
        //outerclass.innerclass var = new outerclass.iinerclass()
outer.inner i = new outer.inner();
i.display();


    }
}
