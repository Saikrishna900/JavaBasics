import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

/*collection represents of group of objects it provides classes and interfaces for to write the code quickly and efficiently
Need of collection:
we need collection for efficient storage and manipulation of data
//generics in java
generics means parameterized types the idea is to allow type (Integer,String,so...) to be a parameter method,clases and interfaces
generic classes:
these are implemented exactly like non generic class. the only difference is that it contains the type parameter
The interface is called dequeue is present in java.util
The dequeue supports tha addition and removal of the elements from both ends of the data structure
Dequeue is also knows as double ended queue
*/
public class collections {
    public static void main(String[] args) {
//        ArrayList<Integer> a1 = new ArrayList<>();
//        ArrayList<Integer> a2 = new ArrayList<>();
//
//        a1.add(2);
//        a1.add(5);
//        a1.add(6);
//        a1.add(4);
//        a1.add(7);
//        a2.add(1000);
//        a2.add(2000);
//        a1.addAll(a2);
////        for (int x:a1){
////            System.out.println(x);
////        }
//        for(int i=0;i<a1.size();i++){
//            System.out.println(a1.get(i));
//        }
//        //contains
////        System.out.println(a1.contains(5));
////        System.out.println(a1.indexOf(5));
////        System.out.println(a1.lastIndexOf(4));
//      a1.remove(2);
//        System.out.println(a1);
//        System.out.println(a1.set(4,12));
//        System.out.println(a1.subList(1,3));
//    }
//        LinkedList<Integer> l1 = new LinkedList<>();
//        l1.add(100);
//        l1.add(200);
//        l1.add(300);
//        l1.add(1,600);
//        l1.addFirst(500);
//        l1.addLast(700);
//        System.out.println(l1);
//        ArrayDeque<Integer> ad = new ArrayDeque<>();
//        ad.add(10);
//        ad.add(20);
//        ad.add(30);
//        ad.addFirst(40);
//        ad.addLast(60);
//        ad.offerFirst(15);
//        System.out.println(ad.getFirst());
//        System.out.println(ad.getLast());
//        System.out.println(ad);
//        System.out.println(ad.removeLast());
//        System.out.println(ad.removeFirst());
//        ad.pollFirst();
//        ad.pollLast();
//        System.out.println(ad);
        //write  a program to print the following details of 5 students name age state course city using arraydeque class

        ArrayDeque<String[]> student  = new ArrayDeque<>();
        student.add(new String[]{"Saikrishna","21","Telanagana","B.Tech","Hyd"});
        student.add(new String[]{"Dharani","20","Andhra Pradesh","MBA","Hyd"});
        student.add(new String[]{"Bharath","23","South Africa","BBA","Hyd"});
        student.add(new String[]{"Kalyan","24","karnataka","MCA","Hyd"});
        student.add(new String[]{"Akhil","23","Maharastra","BSc","Hyd"});

        for(String[] studentDetails:student){
            System.out.println("Name: " + studentDetails[0]);
            System.out.println("Age: " + studentDetails[1]);
            System.out.println("State: " + studentDetails[2]);
            System.out.println("Course: " + studentDetails[3]);
            System.out.println("City: " + studentDetails[4]);
            System.out.println();
        }
}
}