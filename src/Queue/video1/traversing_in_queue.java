package Queue.video1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class traversing_in_queue {
    public static  Queue<Integer> q=new LinkedList<>();
    static void main() {

        q.add(10);
        q.add(25);
        q.add(35);
        q.add(56);
        q.add(75);
        q.add(86);
        q.add(95);
        q.add(66);
        q.add(45);
        q.add(36);

        printing_mannually();

        add_specific_index(58,3);

        printing_mannually();

        remove_specific_index(3);

        printing_mannually();

        System.out.println(peek_specific_index(2));

        reverse();

        printing_mannually();

    }

//    reversing the queue
    static void reverse(){
        Stack<Integer> st=new Stack<>();
        while(q.size()>0)
            st.add(q.remove());

        while(st.size()>0)
           q.add(st.pop());

    }

//    mannually printing the queue
    static void printing_mannually(){
        int n=q.size();

        for(int i=0;i<n;i++){
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
        System.out.println();
    }

//    for adding at specific index
    static void add_specific_index(int val, int idx){
        for(int i=0;i<idx;i++){
            q.add(q.remove());
        }
        q.add(val);
        for(int i=idx;i<q.size()-1;i++){
            q.add(q.remove());
        }

    }

    //    for removing at specific index
    static int remove_specific_index(int idx){
        for(int i=0;i<idx;i++){
            q.add(q.remove());
        }
       int res= q.remove();
        for(int i=idx;i<q.size()-2;i++){ // here as we have removed an element from queue in another function and until the function is not called in main function not will be deleted from the queue but as we have to re rotate it we have to do size-2 normally we do size-1 because we are taking 0 index based but for removal size decreases so size -2
            q.add(q.remove());
        }

        return res;
    }

//    for printing at specific index

    static int peek_specific_index(int idx){
        for(int i=0;i<idx;i++){
            q.add(q.remove());
        }
        int res=q.peek();
        for(int i=idx;i<q.size()-1;i++){
            q.add(q.remove());
        }
        return res;
    }
}
