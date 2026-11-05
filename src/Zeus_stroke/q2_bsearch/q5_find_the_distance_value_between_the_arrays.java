package Zeus_stroke.q2_bsearch;

import java.util.Arrays;

public class q5_find_the_distance_value_between_the_arrays {
//     time complexity is O(Nlog M + Mlog M)
    class Solution {
        public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
            Arrays.sort(arr2);
            int count=0;

            for(int i=0;i<arr1.length;i++){
                int[] ans=binary_search(arr2, arr1[i]);
                int floorIdx = Math.max(0, Math.min(ans[1], arr2.length - 1));
                int ceilIdx = Math.max(0, Math.min(ans[0], arr2.length - 1));
                if(Math.abs(arr2[floorIdx]-arr1[i])<=d || Math.abs(arr2[ceilIdx]-arr1[i])<=d)continue;
                count++;
            }
            return count;
        }
        int[] binary_search(int[] arr, int target){
            int s=0;
            int e=arr.length-1;
            while(s<=e){
                int mid=(s+e)/2;
                if(target==arr[mid])return new int[]{mid, mid};
                else if(target<arr[mid]){
                    e=mid-1;
                }
                else{

                    s=mid+1;
                }
            }
            return new int[]{s,e};
        }
    }

//    another approach same tc no need , just for fun

    class Solution2 {
        public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
            Arrays.sort(arr2);
            int count = 0;

            for (int i = 0; i < arr1.length; i++) {
                int target = arr1[i];
                int idx = Arrays.binarySearch(arr2, target);

                boolean isValid = true;

                if (idx >= 0) {
                    // Exact match found -> distance is 0, which is <= d
                    isValid = false;
                } else {
                    // binarySearch returns -(insertion point) - 1
                    int insertionPoint = -idx - 1;

                    // Check the element just greater than target (ceil) if it exists
                    if (insertionPoint < arr2.length) {
                        if (Math.abs(arr2[insertionPoint] - target) <= d) {
                            isValid = false;
                        }
                    }

                    // Check the element just smaller than target (floor) if it exists
                    if (insertionPoint - 1 >= 0) {
                        if (Math.abs(arr2[insertionPoint - 1] - target) <= d) {
                            isValid = false;
                        }
                    }
                }

                if (isValid) {
                    count++;
                }
            }
            return count;
        }
    }
}
