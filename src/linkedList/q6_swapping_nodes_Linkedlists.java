package linkedList;

//https://leetcode.com/problems/swapping-nodes-in-a-linked-list/

public class q6_swapping_nodes_Linkedlists {
    static void main() {

    }
//    slow and fast approach

    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast=head;
        for(int i=1;i<k;i++){
            fast=fast.next;
        }

        ListNode ini=fast;
        ListNode slow=head;

        fast=fast.next;

        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }

        int x=ini.val;
        ini.val=slow.val;
        slow.val=x;

        return head;
    }
//    normal approach

//    public static ListNode swapNodes(ListNode head, int k) {
//        ListNode t=head;
//        int s=1;
//        while(t!=null){
//            s++;
//            t=t.next;
//        }
//        ListNode temp=head;
//        ListNode temp2=head;
//
//        for(int i=1;i<k;i++){
//            temp=temp.next;
//        }
//        for(int i=1;i<s-k+1;i++){
//            temp2=temp2.next;
//        }
//
//        int x=temp.val;
//        temp.val=temp2.val;
//        temp2.val=x;
//
//
//        return head;
//    }
}

