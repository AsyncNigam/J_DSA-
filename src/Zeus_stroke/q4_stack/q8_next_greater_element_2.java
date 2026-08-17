package Zeus_stroke.q4_stack;

import java.util.Stack;

public class q8_next_greater_element_2 {
    class Solution {
        public int[] nextGreaterElements(int[] nums) {
            Stack<Integer> st=new Stack<>();
            int n=nums.length;
            int[] ans=new int[n];
            for(int i=n-1;i>=0;i--){
                st.push(nums[i]);
            }
            for(int i=n-1;i>=0;i--){
                while(!st.isEmpty() && st.peek()<=nums[i])st.pop();
                if(st.isEmpty())ans[i]=-1;
                else ans[i]=st.peek();
                st.push(nums[i]);
            }
            return ans;
        }
    }
}
