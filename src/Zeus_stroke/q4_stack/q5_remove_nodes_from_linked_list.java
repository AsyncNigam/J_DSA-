package Zeus_stroke.q4_stack;

import linkedList.ListNode;

import java.util.Stack;

public class q5_remove_nodes_from_linked_list {
    class Solution {
        public ListNode removeNodes(ListNode head) {
            ListNode temp=head;
            Stack<ListNode> st=new Stack<>();
            while(temp!=null){
                while(st.size()>0 && st.peek().val<temp.val)st.pop();
                st.push(temp);
                temp=temp.next;
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
