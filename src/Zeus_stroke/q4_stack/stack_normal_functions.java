package Zeus_stroke.q4_stack;

import java.util.Stack;

public class stack_normal_functions {
        static void main() {
//        Stack<String> st=new Stack<>();
//        st.push("Nigam");
//        st.push("Putul");
//        st.push("mama");
//        st.push("dad");
//        st.push("tuan");

//        System.out.println(st);
//
//        System.out.println(st.peek());
//        System.out.println(st);
//        System.out.println(st.pop());
//        System.out.println(st+" "+st.size());

            Stack<Integer> st=new Stack<>();
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(50);
            st.push(60);
            st.push(70);
            st.push(80);

            display(st);

            st=reverseArray(st);
            display(st);
        }

//    this function will print the stack
//    but it will take an extra auxilary space of O(n) which happens only in stack

        static void display(Stack<Integer> st){
            Stack<Integer> st2=new Stack<>();
            while(st.size()>0){
                int top=st.pop();   // here the stack will be printed in reverse order like LAST IN FIRST OUT (LIFO)
                System.out.print(top+" ");  // as we are 1st removing the elements from the top of the 1st stack , printing it then adding to another stack
                st2.push(top);
            }
            System.out.println();
            while(st2.size()>0){
                st.push(st2.pop()); // if we print here , the stack will be printed in correct order
            }
        }

        //    to reverse the stack
        static Stack<Integer> reverse(Stack<Integer> st){
            Stack<Integer> st2=new Stack<>();
            Stack<Integer> st3=new Stack<>();
            while(st.size()>0){
                st2.push(st.pop());
            }
            while(st2.size()>0){
                st3.push(st2.pop());
            }
            while(st3.size()>0){
                st.push(st3.pop());
            }
            return st;
        }

        //    to reverse with array
        static Stack<Integer> reverseArray(Stack<Integer> st){
            int[] arr=new int[st.size()];
            while(st.size()>0){
                arr[arr.length - st.size()]=st.pop();
            }
            for(int i=0;i< arr.length;i++){
                st.push(arr[i]);
            }
            return st;
        }

    }


