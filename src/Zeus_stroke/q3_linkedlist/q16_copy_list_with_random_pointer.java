package Zeus_stroke.q3_linkedlist;

public class q16_copy_list_with_random_pointer {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    class Solution {
        public Node copyRandomList(Node head) {
            Node dummy =new Node(-1);
            Node t1=head;
            Node t2=dummy;

            // creating a lean forward clone
            while(t1!=null){
                t2.next=new Node(t1.val);
                t1=t1.next;
                t2=t2.next;
            }

            // now mixing them both
            t1=head;
            t2=dummy.next;
            Node t=head;
            while(t2!=null){
                t=t2.next;
                t2.next=t1.next;
                t1.next=t2;
                t1=t2.next;
                t2=t;
            }

            // assigning random
            t1=head;
            while(t1!=null){
                t2=t1.next;
                if(t1.random != null){
                    t2.random=t1.random.next;
                }
                t1=t2.next;
            }

            t1=head;
            t2=dummy.next;
            while(t1!=null){
                t=t1.next;
                t1.next=t.next;
                t2.next=(t1.next!=null)?t.next.next:null;
                t1=t1.next;
                t2=t2.next;
            }
            return dummy.next;
        }
    }
}
