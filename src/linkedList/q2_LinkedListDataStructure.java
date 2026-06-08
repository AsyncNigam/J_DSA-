package linkedList;

class Linkedlist{ //it is user defined data structure ,
    // the class Node that we have made was a user defined data type
    Node head;  //null
    Node tail;  //null


    int size; //to count the size of the linked list

    void addAtTail(int val){
        Node temp=new Node(val);
        if(tail==null){
            //if the linkedlist is empty i.e. head=tail=null
            // ,then directly add temp to tail
            head=tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp; // now temp had become the last node ,
            // so the last node should be tail
        }

        size++; //after adding element size increases

    }

    void display(){
        if(head==null)return;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    void addAtHead(int val){
        Node temp=new Node(val);
        if(head==null)head=tail=temp; //if the linked list is empty
        else{
            temp.next=head;
            head=temp;
        }

        size++;
        //size will increase
    }

    void deleteAtHead(){
        if(head==null){
            System.out.println("LinkedList is empty");
            return;
        }
        head = head.next;
        //directly move your head to next element simple .
        // no need the change the reference of the previous node

        if(head==null)tail=null; //in case the Linked list has only one element now we have deleted
        // so head has become null that now we also need to move the tail to null also

        size--;
        //after deleting size will decrease
    }

    void deleteAtTail(){
        if(tail==null){
            System.out.println("can not delete from empty linkedlist");
            return;
        }
        Node temp=head;
        for(int i=1;i<size-1;i++){ //because size is 1 index based
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;

        if(tail==null)head=null;//if it was containing single element
    }

    int search(int val){
        if(head==null)return -1;
        Node temp=head;
        int idx=0;
        while(temp!=null){
            if(temp.val==val)return idx;
            temp=temp.next;
            idx++;
        }
        return -1;
    }

    void insert(int idx,int val){
      if(idx<0||idx>size){
          System.out.println("invalid index");
          return;
      }
      if(idx==0)addAtHead(val);
      else if(idx==size)addAtTail(val);
      else {
          Node temp = head;

          for (int i = 1; i <= idx - 1; i++) {   //let it be 1 based index
              temp = temp.next;
          }
          Node el = new Node(val);
          el.next = temp.next;
          temp.next = el;

          size++;
      }


    }

    int get(int idx){
        Node temp=head;
        for(int i=1;i<idx;i++){
            temp=temp.next;
        }
        return temp.val;
    }

    public void delete(int idx) {
        if(idx<0||idx>size){
            System.out.println("invalid index");
            return;
        }
        if(idx==0)deleteAtHead();
        else if(idx==size)deleteAtTail();
        else {
            Node temp = head;
            for (int i = 1; i <=idx; i++) {   //let it be 1 based index
                temp = temp.next;
            }
            temp.next=temp.next.next;
        }
    }
}


// anywhere on the linked list package this file is accesible without any import

public class LinkedListDataStructure {

    static void main() {
    Linkedlist ll=new Linkedlist();
        ll.addAtTail(20);
        ll.addAtHead(35);
        ll.addAtTail(40);
        ll.addAtHead(55);
        ll.addAtTail(30);
        ll.addAtHead(45);
        ll.addAtTail(50);
        ll.addAtHead(95);



//      System.out.println( ll.search(30));

//      ll.deleteAtTail();
//      ll.display();

        ll.insert(3,10);
        ll.display();

//      System.out.println(  ll.get(5));

        ll.delete(4);
        ll.display();

    }
}
