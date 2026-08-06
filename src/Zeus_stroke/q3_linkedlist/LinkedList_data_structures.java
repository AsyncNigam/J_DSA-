package Zeus_stroke.q3_linkedlist;

public class LinkedList_data_structures extends RuntimeException {
     static void main() {
        Node a=new Node(12);
        Node b=new Node(13);
        Node c=new Node(14);
        Node d=new Node(15);
        Node e=new Node(16);
        Node f=new Node(17);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=null;
        head = a;
        tail = f;
        size = 6;

        display();
        AddAtTail(18);
        display();
        AddAtHead(19);
        display();
        DeleteAtHead();
        display();
        DeleteAtTail();
        display();
         System.out.println( search(16));

         insert(45,3);
         display();

    }

   static Node head;
    static Node tail;
    static int size=0;

   static void AddAtTail(int val){
        Node temp=new Node(val);
        if(tail==null){
            tail=head=temp;
        }
        else{
            tail.next=temp;
            tail=tail.next;
        }
        size++;
    }

    static void display(){
       if(head==null)return;
       Node temp=head;
       while(temp!=null){
           System.out.print(temp.val+" ");
           temp=temp.next;
       }
        System.out.println();

    }

    static void AddAtHead(int val){
       Node temp=new Node(val);
       if(head==null)head=tail=temp;
       else{
           temp.next=head;
           head=temp;
       }
       size++;

    }

    static void DeleteAtHead(){
       if(head==null) {
           throw new IllegalStateException("Linked List is empty.");
       }
       head=head.next;
       size--;
    }

    static void DeleteAtTail(){
       if(head==null){
           throw new IllegalStateException("Linked LIst is empty.");
       }
       Node temp=head;
       while(temp.next!=tail){
           temp=temp.next;
       }
       temp.next=null;
       tail=temp;
       size--;
    }

    static int search(int  val){
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

    static void insert(int val, int idx){
       Node temp=new Node(val);
       Node t=head;
       for(int i=0;i<idx-1;i++){
           t=t.next;
       }

       temp.next=t.next;
        t.next=temp;
    }






}
