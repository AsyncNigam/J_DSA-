package Zeus_stroke.q7_string;

public class q4_maximum_value_of_a_string_in_an_array {
    class Solution {
        public int maximumValue(String[] strs) {
            int max=Integer.MIN_VALUE;
            for(String str:strs){
                try{
                    int num=Integer.parseInt(str);
                    max=Math.max(max, num);
                }
                catch (NumberFormatException e) {
                    max=Math.max(max, str.length());
                }
            }
            return max;
        }
    }
}
