//java hashmap  class implements the map interface which allows us to store key and value pair, where keys should be unique
//Java Hashmap maintains no order
//the initial default capacity of the java hashmap class is 16 with a load factor of 75.
//fetching key values pair seperately by keyset method
//syntax: map.keyset();

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {

//        HashMap<Integer,String> map = new HashMap<>();
//        map.put(1,"A");
//        map.put(2,"B");
//        map.put(3,"C");
//        map.put(4,"D");
//        map.put(4,"S");
//
//        System.out.println(map);
//        System.out.println(map.get(4));
//        System.out.println(map.get(9));
//
//        if(map.containsKey(2)){
//            System.out.println("Key is present");
//        }
//        else{
//            System.out.println("Key is not present");
//        }
//        Set<Integer> S = map.keySet();
//       for(int x:S){
//           System.out.println(x+" "+map.get(x));
//       }

        HashSet<Integer> S = new HashSet<>();
        S.add(1);
        S.add(2);
        S.add(3);
        S.add(4);
        S.add(5);
        S.add(2);
        System.out.println(S);
//        for(int x: S){
//            System.out.println(x);
//        }
//        Integer i = S.size();
//        System.out.println(i);
//        S.remove(5);
//        System.out.println(S);
        Iterator i = S.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}
