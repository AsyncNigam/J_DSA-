package Zeus_stroke.q3_linkedlist;

public class q18_find_the_minimum_and_maximum_number_of_nodes_between_critical_points {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public int[] nodesBetweenCriticalPoints(ListNode head) {
            ListNode a=head;
            ListNode b=head.next;
            ListNode c=head.next.next;
            if(c==null)return new int[]{-1, -1};
            int fIdx=-1, Idx=1, lIdx=-1, minDist=Integer.MAX_VALUE;
            while(c!=null){
                if((b.val>a.val && b.val>c.val) || (b.val<a.val && b.val<c.val)){
                    if(fIdx==-1)fIdx=Idx;
                    if(lIdx!=-1)minDist=Math.min(minDist, Idx-lIdx);
                    lIdx=Idx;
                }
                a=b;
                b=c;
                c=c.next;
                Idx++;
            }
            int maxDist=-1;
            if(lIdx>fIdx)maxDist=lIdx-fIdx;
            if(minDist==Integer.MAX_VALUE)minDist=-1;
            return new int[]{minDist, maxDist};
        }
    }
}
