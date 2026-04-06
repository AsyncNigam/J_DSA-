package A_Practicing_revision;

import java.util.*;

public class leetcode_15_three_sum {
    static void main() {

    }


// this is the brute force approach    time=O(n^3 * log(unique triplets))    space=O(unique triplets)

//    public List<List<Integer>> threeSum(int[] nums) {
//        int n = nums.length;
//        List<List<Integer>> ans = new ArrayList<>();
//        // A Set of Lists handles uniqueness automatically in Java
//        Set<List<Integer>> s = new HashSet<>();
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                for (int k = j + 1; k < n; k++) {
//
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        List<Integer> trip = Arrays.asList(nums[i], nums[j], nums[k]);
//                        // Sorting ensures that [1, -1, 0] and [0, 1, -1]
//                        // are treated as the same triplet
//                        Collections.sort(trip);
//
//                        if (!s.contains(trip)) {
//                            s.add(trip);
//                            ans.add(trip);
//                        }
//                    }
//                }
//            }
//        }
//        return ans;
//    }



//    approach with hashing  time=O(n^2 * log(unique))    space=O(unique triplets)+O(n)
//    class Solution {
//        public List<List<Integer>> threeSum(int[] nums) {
//            Set<List<Integer>> uni=new HashSet<>();
//
//            for(int i=0;i<nums.length;i++){
//                int target=-nums[i];
//
//                Set<Integer> s=new HashSet<>();
//                for(int j=i+1;j<nums.length;j++){
//
//                    int third=target-nums[j];
//
//                    if(s.contains(third)){
//                        List<Integer> trip = Arrays.asList(nums[i], nums[j], third);
//                        Collections.sort(trip);
//                        uni.add(trip);
//                    }
//                    s.add(nums[j]);
//                }
//            }
//            List<List<Integer>> ans=new ArrayList<>(uni);
//            return ans;
//        }
//    }


//    best approach with soting and 2 pointer , time=O(n^2)
        class Solution {
            public List<List<Integer>> threeSum(int[] nums) {
                List<List<Integer>> ans=new ArrayList<>();
                Arrays.sort(nums);
                int n=nums.length;
                for(int i=0;i<n;i++){
                    if(i>0 && nums[i]==nums[i-1])continue;
                    int j=i+1,k=n-1;
                    while(j<k){
                        int sum=nums[i]+nums[j]+nums[k];
                        if(sum<0)j++;
                        else if(sum>0)k--;
                        else {
                            ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                            j++;
                            k--;
                            while(j<k && nums[j]==nums[j-1])j++;
                            while (j < k && nums[k] == nums[k + 1]) k--;
                        }
                    }
                }
                return ans;
            }
        }

}
