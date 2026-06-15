package A_Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class q10_leetcode_75_find_the_differece_of_2_arrays {
    class Solution {
        public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            List<List<Integer>> answer=new ArrayList<>(2);
            HashSet<Integer> set1=new HashSet<>();
            HashSet<Integer> set2=new HashSet<>();

            for(int el:nums1)set1.add(el);
            for(int el:nums2)set2.add(el);

            List<Integer> list1=new ArrayList<>(set1.size());
            for(int el:set1)if(!set2.contains(el))list1.add(el);


            List<Integer> list2=new ArrayList<>(set2.size());
            for(int el:set2)if(!set1.contains(el))list2.add(el);

            answer.add(list1);
            answer.add(list2);

            return answer;

        }
    }
}
