package linkedList;

public class q3_DisplayLinkedList {
    static void main() {
//        as we are in the same package linkedlist
//        we can directly use the class without any implementation


//        now we have created a linkedlist 10->20->30->40->50
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

//        to print the entire linkedlist we will create a function display
//        in which we will pass only the head element i.e. a

//        display(a); // direct printing of linked list
//        displayRec(a);//here it will print the entire linked list from first to last using recurion
//        displayRecReverse(a); // reverse printing of linkedlist using recursion


        System.out.println(get(a,3));
    }
    static void display(Node head){

        Node temp=head;
//
        while(temp!=null) { //because last element is storing null in his next
            System.out.print(temp.val + " "); // then we will print the value
                    temp = temp.next;// very, very important because temp.next is the containg the reference of next element , so after printing one element we wre going to next element just like temp++ in normal array

        }


//        instead of using while loop we can use for loop
//        look in for loop we have to initialise ; then condition ; then increment
//        we can do like this

//        for(Node temp=head;temp!=null;temp=temp.next){
//            System.out.println(temp.val+" ");
//        }



    }

//     we can also do by the recursion

    static void displayRec(Node head){
        if(head==null)return;
        System.out.print(head.val+" ");
        displayRec(head.next);
    }

    static void displayRecReverse(Node head){
        if(head==null)return;
        displayRecReverse(head.next);
        System.out.print(head.val+" ");

    }

//    to get the element at particular index
    static int get(Node head,int idx){
        Node temp=head;
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        return temp.val;
    }

}
