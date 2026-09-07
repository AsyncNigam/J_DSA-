package Zeus_stroke.basic_questions;

import java.util.*;

public class q5_three_sum {

//    here tc is O(n^2 * log(unique)) it will not give tle but too much high tc
//    class Solution {
//        public List<List<Integer>> threeSum(int[] nums) {
//            HashSet<List<Integer>> set=new HashSet<>();
//            int n=nums.length;
//            for(int i=0;i<n;i++){
//                int target=-nums[i];
//                HashSet<Integer> s=new HashSet<>();
//                for(int j=i+1;j<n;j++){
//                    int third=target-nums[j];
//                    if(s.contains(third)){
//                        List<Integer> tour= Arrays.asList(nums[i],nums[j],third);
//                        Collections.sort(tour);
//                        set.add(tour);
//                    }
//                    else s.add(nums[j]);
//                }
//            }
//
//            List<List<Integer>> ans=new ArrayList<>();
//            for(List<Integer> list: set){
//                ans.add(list);
//            }
//
//            return ans;
//
//        }
//    }


//    best approach with soting and 2 pointer , time=O(n^2)
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            int n=nums.length;
            List<List<Integer>> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(i>0 && nums[i]==nums[i-1])continue;
                int j=i+1;
                int k=n-1;
                while(j<k){
                    int sum=nums[i]+nums[j]+nums[k];
                    if(sum<0)j++;
                    else if(sum>0)k--;
                    else {
                        list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        j++;
                        k--;
                        while(j<k && nums[j]==nums[j-1]){
                            if(j>0)j++;
                            else break;
                        }
                        while(j<k && nums[k]==nums[k+1]){
                            if(k<n-1)
                                k--;
                            else break;}
                    }

                }
            }
            return list;
        }
    }
}
