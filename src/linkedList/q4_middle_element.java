package linkedList;

public class q4_middle_element {
    public ListNode middleNode(ListNode head) {

//      this is a 2 traverse technique technically same time complexity as of slow fast but not the best one
//        int size=0;
//        for(ListNode temp=head;temp!=null;temp=temp.next){
//            size++;
//        }
//        ListNode t=head;
//        for(int i=0;i<size/2;i++){
//            t=t.next;
//        }
//        return t;

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }

    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null)return null;
        ListNode slow=head;
        ListNode fast=head.next.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;

        return head;
    }
}





