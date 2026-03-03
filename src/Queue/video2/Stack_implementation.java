package Queue.video2;

import java.util.Stack;

public class Stack_implementation {

//it is added efficient approach .

// like we are adding to a normal stack but in stack it is LIFO where as Queue is FIFO , so to remove the 1st added elemt in stack we use another helper stack reverse add to helper then remove the last of stack , then again add from helper to stack


//    class MyQueue {
//        Stack<Integer> st=new Stack<>();
//        Stack<Integer> helper=new Stack<>();
//        public MyQueue() {
//
//        }
//
//        public void push(int x) {
//            st.push(x);  // O(1)
//        }
//
//        public int pop() {  //here O(n) , O(n)
//            while(st.size()>1){
//                helper.push(st.pop());
//            }
//            int front=st.pop();
//            while(helper.size()>0){
//                st.push(helper.pop());
//            }
//            return front;
//        }
//
//        public int peek() { //here O(n) , O(n)
//            while(st.size()>1){
//                helper.push(st.pop());
//            }
//            int front=st.peek();
//            while(helper.size()>0){
//                st.push(helper.pop());
//            }
//            return front;
//        }
//
//        public boolean empty() {
//            return st.size()==0;
//        }
//    }


//    for the Pop Efficient approach
class MyQueue {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> helper=new Stack<>();
    public MyQueue() {

    }

    public void push(int x) {
        while(st.size()>0){
            helper.push(st.pop());
        }
        st.push(x);
        while(helper.size()>0){
            st.push(helper.pop());
        }
    }

    public int pop() {
        return  st.pop();
    }

    public int peek() {
        return st.peek();
    }

    public boolean empty() {
        return st.size()==0;
    }
}


}
