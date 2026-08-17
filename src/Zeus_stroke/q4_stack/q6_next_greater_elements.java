package Zeus_stroke.q4_stack;

import java.util.ArrayList;
import java.util.Stack;

public class q6_next_greater_elements {
//    https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1
    class Solution {
        public ArrayList<Integer> nextLargerElement(int[] arr) {
            // code here
            int n=arr.length;
            int[] nge=new int[n];
            Stack<Integer> st=new Stack<>();

            nge[n-1]=-1;
            st.push(arr[n-1]);
            for(int i=n-2;i>=0;i--){
                while(!st.isEmpty() && arr[i]>=st.peek()){
                    st.pop();
                }
                if(st.isEmpty()){nge[i]=-1;}
                else nge[i]=st.peek();
                st.push(arr[i]);
            }

            ArrayList<Integer> ans=new ArrayList<>();
            for(int el:nge){
                ans.add(el);
            }
            return ans;
        }
    }
}
