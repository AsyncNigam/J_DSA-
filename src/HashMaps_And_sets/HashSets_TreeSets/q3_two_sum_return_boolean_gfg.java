package HashMaps_And_sets.HashSets_TreeSets;

import java.util.HashSet;
//https://www.geeksforgeeks.org/problems/key-pair5616/1
public class q3_two_sum_return_boolean_gfg {
    class Solution {
        boolean twoSum(int arr[], int target) {
            // code here
            HashSet<Integer> set=new HashSet<Integer>();
            for(int el:arr){
                if(set.contains(target-el))return true;
                set.add(el);

            }
            return false;

        }
    }
}
