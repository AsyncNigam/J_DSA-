package Queue.video1;

import java.util.LinkedList;
import java.util.Queue;

import static Queue.video1.traversing_in_queue.q;

public class BasicsOfQueue {
    static void main() {
//        Queue<Integer> q=new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(70);

        System.out.println(q);
        System.out.println(q.peek());

        System.out.println(q.size());

        q.remove();
        System.out.println(q.size());

//         printing by built in sout()
        System.out.println(q);
    }
}