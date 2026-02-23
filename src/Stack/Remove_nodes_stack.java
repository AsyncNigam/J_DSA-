package Stack;

import linkedList.ListNode;

import java.util.Stack;

public class Remove_nodes_stack {
    class Solution {
        public ListNode removeNodes(ListNode head) {
            ListNode temp=head;
            Stack<ListNode> st=new Stack<ListNode>();
            while(temp!=null){
                while (!st.isEmpty() && st.peek().val < temp.val) {
                    st.pop();
                }
                st.push(temp);
                temp = temp.next;
            }

            while(st.size()>0){
                ListNode t=st.pop();
                t.next=temp;
                temp=t;
            }
            return temp;

        }
    }
}
