package Stack.video4;

import java.util.Stack;

public class minStack {

//    approach 1 with extra stack
    class MinStack {
        Stack<Integer> st;
        Stack<Integer> minSt;

        public MinStack() {
            st=new Stack();
            minSt=new Stack();
        }

        public void push(int val) {
            st.push(val);
            if(minSt.size()==0 || val < minSt.peek())minSt.push(val);
            else minSt.push(minSt.peek());
        }

        public void pop() {
            st.pop();
            minSt.pop();
        }

        public int top() {
            return  st.peek();
        }

        public int getMin() {
            return minSt.peek();
        }
    }

//    approach 2 without extra stack with ath formula
    
}
