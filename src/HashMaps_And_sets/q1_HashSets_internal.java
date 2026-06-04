package HashMaps_And_sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class q1_HashSets_internal {
    static void main() {
        HashSet<Integer> set=new HashSet<>();  // it is unordered when print will be in random order ,ime complexity for inserting , checking , deleting is O(1) constant

        TreeSet<Integer> tree_set=new TreeSet<>();  // it is ordered but time complexity for inserting , checking , deleting is O(log n)

// can be
// Set<Integer> set =new HashSet<>();
//        as Set is an interface it can not have object , HashSet implements Set


        set.add(77); // add() will add to set
        set.add(7);
        set.add(72);
        set.add(37);
        set.add(9);

        System.out.println(set.size()); // will give size



        System.out.println(set.contains(25)); // to check that it contains element or not , contains() returns true/false depending upon element present in the set or not



        System.out.println(set.contains(72));

        System.out.println(set.remove(72)); // for removing the element , this .remove() returns true / false depending upon can be removed or not if element not present will return false if present then it will return true and remove that element

        System.out.println(set.contains(72));

        System.out.println(set.size());



        set.add(21);
        System.out.println( set.size() ); // size =5
        set.add(21);
        System.out.println( set.size() ); // size =5 here also size is 5 not 6 because in hashset duplicate elements can be present ,
        //hashset is a set and in set there can not be duplicate elements

        //for printing the set
        System.out.println(set);

        System.out.println(set.remove(999));


    }
}
