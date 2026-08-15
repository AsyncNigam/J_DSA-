package Zeus_stroke.q4_stack;

import java.util.Stack;

public class q4_baseball_game {
    class Solution {
        public int calPoints(String[] operations) {
            Stack<String> st = new Stack<>();

            for (int i = 0; i < operations.length; i++) {
                if (operations[i].equals("+")) {
                    int top = Integer.parseInt(st.pop());
                    int top2 = Integer.parseInt(st.pop());
                    int res = top + top2;
                    st.push(String.valueOf(top2));
                    st.push(String.valueOf(top));
                    st.push(String.valueOf(res));
                } else if (operations[i].equals("D")) {
                    int top = Integer.parseInt(st.peek());
                    st.push(String.valueOf(top * 2));
                } else if (operations[i].equals("C")) {
                    st.pop();
                } else {
                    // It's a number (handles positive, negative, any value)
                    st.push(operations[i]);
                }
            }

            int sum = 0;
            while (!st.isEmpty()) {
                sum += Integer.parseInt(st.pop());
            }
            return sum;
        }
    }
}
