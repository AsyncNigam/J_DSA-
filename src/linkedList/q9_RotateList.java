package linkedList;

public class q9_RotateList {

        static void main() {

        }
        int length(ListNode head){
            ListNode temp = head;
            int l = 0;  // Fixed: should start at 0, not 1
            while(temp != null){
                temp = temp.next;
                l++;
            }
            return l;
        }

        public ListNode rotateRight(ListNode head, int k) {
            if(head == null || head.next == null) return head;

            int len = length(head);
            k = k % len;
            if(k == 0) return head;

            // Find the node at position (len - k - 1)
            // This will be the new tail
            ListNode temp = head;
            for(int i = 1; i < len - k; i++){
                temp = temp.next;
            }

            // temp is now at the new tail position
            ListNode newHead = temp.next;  // The new head
            temp.next = null;  // Break the link

            // Find the old tail and connect it to the old head
            ListNode oldTail = newHead;
            while(oldTail.next != null){
                oldTail = oldTail.next;
            }
            oldTail.next = head;  // Connect old tail to old head

            return newHead;
        }
    }


