package Zeus_stroke.q4_stack;

import java.util.Stack;

public class q1_push_pop {
    static void main() {
        Stack<Integer> st=new Stack<>();
        st.push(12);
        st.push(15);
        st.push(18);
        st.push(29);
        st.push(97);

        System.out.println(st);
//        display(st);


        display(reverse(st));
    }
    static Stack<Integer> reverse(Stack<Integer> st){
        Stack<Integer> st2=new Stack<>();
        while(st.size()>0){
            st2.add(st.pop());
        }
        return st2;

    }
    static void display(Stack<Integer> st){
        Stack<Integer> st2=new Stack<>();
        while(st.size()>0){
            st2.add(st.pop());
        }
        while(st2.size()>0){
            System.out.print(st2.pop()+" ");
        }
    }
}
