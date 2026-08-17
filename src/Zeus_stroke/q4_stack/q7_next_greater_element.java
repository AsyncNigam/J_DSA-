package Zeus_stroke.q4_stack;

import java.util.Stack;

public class q7_next_greater_element {
    class Solution {
        public int[] nextGreaterElements(int[] nums) {
            Stack<Integer> st=new Stack<>();
            for(int el:nums)st.push(el);

            int n=nums.length;
            int[] ans=new int[n];
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
