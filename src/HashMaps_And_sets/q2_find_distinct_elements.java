package HashMaps_And_sets;

import java.util.HashSet;
//https://www.geeksforgeeks.org/problems/find-distinct-elements-1614078205/1
public class q2_find_distinct_elements {
    class Solution {
        static int distinct(int arr[], int n) {
            // code here
            HashSet<Integer> set=new HashSet<>();
            for(int el:arr){
                set.add(el);
            }
            return set.size();
        }
    }
}
