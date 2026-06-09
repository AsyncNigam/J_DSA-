package HashMaps_And_sets.Maps;

import java.util.HashMap;

//this is the question of linked list

//https://leetcode.com/problems/copy-list-with-random-pointer/description/
public class q8_copy_list_with_random_pointer {
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
        Node deepCopy(Node head1){
            Node temp1=head1;
            Node head2=new Node(-1);
            Node temp2=head2;
            while(temp1!=null){
                Node t=new Node(temp1.val);
                temp2.next=t;
                temp2=temp2.next;
                temp1=temp1.next;
            }
            return head2.next;
        }
        public Node copyRandomList(Node a) {
            Node b=deepCopy(a);
            Node tempA=a;
            Node tempB=b;
            HashMap<Node, Node> map=new HashMap<>(); //  <a,b>
            while(tempA!=null){
                map.put(tempA, tempB);
                tempA=tempA.next;
                tempB=tempB.next;
            }
            tempA=a;
            while(tempA!=null){
                tempB=map.get(tempA);
                tempB.random=map.get(tempA.random);
                tempA=tempA.next;
            }
            return b;


        }
    }
}
