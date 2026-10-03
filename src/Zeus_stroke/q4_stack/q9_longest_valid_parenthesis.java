package Zeus_stroke.q4_stack;

import java.util.Stack;
//https://leetcode.com/problems/longest-valid-parentheses/?envType=daily-question&envId=2026-10-03
public class q9_longest_valid_parenthesis {
    class Solution {
        public int longestValidParentheses(String s) {
            Stack<Integer> st=new Stack<>();
            st.push(-1);
            int max=0;
            for(int i=0; i<s.length(); i++){
                char ch=s.charAt(i);
                if(ch=='(')st.push(i);
                else{
                    int j=st.pop();
                    if(st.isEmpty()){
                        st.push(i);;}
                    else{
                        max=Math.max(max, i-st.peek());
                    }
                }
            }
            return max;
        }
    }
}
