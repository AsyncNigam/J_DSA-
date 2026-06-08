package linkedList;

public class q8_deleteFromSortedLL {
    static void main() {

    }
   static ListNode deleteDuplicates(ListNode head) {
        ListNode i=head;
        ListNode j=head;
        while(j!=null){
            if(i!=j){
                i.next=j;
                i=j;
            }
            j=j.next;
        }

        return head;
    }
}
