package linkedList;

class Node{  // this is a user defined data type using class
    int val;
    Node next;  //by default the value of next is null
    // until you have added value to it added value to it

    Node(int val){ //constructor
        this.val=val;
    }
}

public class NodeOfLinkedList {
    static void main() {
//        i want to make a linkedlist of 10->20->30->40->50

/*
        Node a=new Node(); a.val=10;
        Node b=new Node(); b.val=20;
        Node c=new Node(); c.val=30;
        Node d=new Node(); d.val=40;
        Node e=new Node(); e.val=50;
 */
//  instead of passing the val with dot operator to access the val attribute we can use constructors directly
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
//        e.next=null; by default next has null value we do not need to write it again

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.next); // a.next is same as b because they are referencing to the same thing of heap memory

        System.out.println(a.next.next);
        System.out.println(c); // a.next.next == c bcz a.next=b and b.next=c


        System.out.println(a.next.next.next.val);  // a.next.next.next.val==d.val==40


    }
}
