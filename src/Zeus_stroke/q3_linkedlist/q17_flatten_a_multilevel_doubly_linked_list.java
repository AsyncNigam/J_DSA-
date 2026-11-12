package Zeus_stroke.q3_linkedlist;

public class q17_flatten_a_multilevel_doubly_linked_list {
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }
    class Solution {
        public Node flatten(Node head) {
            if(head==null)return head;
            Node temp=head;
            while(temp!=null){
                if(temp.child==null)temp=temp.next;
                else{
                    Node child=flatten(temp.child);
                    temp.child=null;
                    Node b=temp.next;
                    temp.next=child;
                    child.prev=temp;
                    while(temp.next!=null){
                        temp=temp.next;
                    }
                    temp.next=b;
                    if(b!=null)b.prev=temp;
                }
            }
            return head;
        }
    }
}
