package Zeus_stroke.q1_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q2_leetcode_2089_find_target_indices_after_sorting {
//    https://leetcode.com/problems/find-target-indices-after-sorting-array/description/

//    brute force approach

//    here the time complexity of sorting is O(NlogN), and the time complexity of linear search is O(n)
//    so total time complexity is O(nlogn) since nlogn>n
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)list.add(i);
        }
        return list;
    }
}


//  the most appropriate answer is with O(n)
//    here just I am just counting the number of element less than the target , also calculating the number of elements equals to target
//    then i am iterating one by one upto number of equal then to less than adding 1
class Solution2 {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list=new ArrayList<Integer>();
        int lessCount=0;
        int equalCount=0;
        for(int num:nums){
            if(num<target)lessCount++;
            if(num==target)equalCount++;
        }
        for(int i=0;i<equalCount;i++)list.add(lessCount+i); // lessCount++
        return list;
    }
}
}
