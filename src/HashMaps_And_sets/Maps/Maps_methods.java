package HashMaps_And_sets.Maps;

import java.util.HashMap;

public class Maps_methods {
    static void main() {
        HashMap<String,Integer> map=new HashMap<>();
//        in map key value pair

        map.put("Nigam",20);
        map.put("abc",50);
        map.put("xyz",80);
        map.put("manoj",21);
        map.put("pratik",21);
        map.put("deepak",30);
        map.put("situn",23);

//        to print the map directly
        System.out.println(map); // but it will print randomly like in any order depending on  the hashcodes

//        to get the value at any key ,
        System.out.println(map.get("Nigam"));

        System.out.println(map.size()); // size() will return the size

        map.remove("xyz"); // this will remove the key and value "xyz"
//        in remove() we have to give the key , not the value , if you will give the value to remove it will return null
//        .remove() will remove the key value and returns the value
        System.out.println( map.remove(21) );      // will return null because it is thinking that we are giving key 21 string with 21
        System.out.println(map.size());
        System.out.println(map.remove("abc"));
        System.out.println(map.size());


        System.out.println(map.containsKey("xyz")); // will return true or false depending that key exists or not

//        to traverse in the map, we will traverse through the keys
        for(String key:map.keySet()) {
            System.out.print(key + ":");
            System.out.print(map.get(key)+"  ");
        }
    }
}
