package Zeus_stroke.q4_stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class q7_next_greater_element_leetcode {
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            HashMap<Integer, Integer> map=new HashMap<>();
            Deque<Integer> st=new ArrayDeque<>();

            for(int i=nums2.length-1;i>=0;i--){
                int el=nums2[i];
                while(!st.isEmpty() && st.peek()<el)st.pop();
                if(st.isEmpty())map.put(el,-1);
                else map.put(el,st.peek());
                st.push(el);
            }

            int[] ans=new int[nums1.length];
            for(int i=0;i<nums1.length;i++){
                ans[i]=map.get(nums1[i]);
            }

            return ans;


        }
    }
}
