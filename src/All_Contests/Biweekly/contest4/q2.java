package All_Contests.Biweekly.contest4;

import java.util.Stack;
//https://leetcode.com/contest/biweekly-contest-195/problems/remove-elements-by-type-and-color/
public class q2 {
    class Solution {
        class Node{
            int type;
            int color;
            int count;
            Node(int type, int color, int count){
                this.type=type;
                this.color=color;
                this.count=count;
            }
        }
        public boolean canRemoveAll(int[] types, int[] colors, int[] groupSize) {
            int n=types.length;
            Stack<Node> st=new Stack<>();
            for(int i=0;i<n;i++){
                int t=types[i];
                int c=colors[i];
                int required=groupSize[t];
                if(required==1)continue;
                if(!st.isEmpty() && st.peek().type==t && st.peek().color==c){
                    st.peek().count++;
                    if(st.peek().count==required)st.pop();
                }
                else st.push(new Node(t,c,1));
            }

            return st.isEmpty();
        }
    }
}
