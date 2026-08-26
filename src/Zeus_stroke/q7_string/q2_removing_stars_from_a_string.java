package Zeus_stroke.q7_string;

//https://leetcode.com/problems/removing-stars-from-a-string/?envType=study-plan-v2&envId=leetcode-75

public class q2_removing_stars_from_a_string {
    class Solution {
        public String removeStars(String s) {
            StringBuilder sb=new StringBuilder();
            for(char ch : s.toCharArray()){
                if(ch=='*'){
                    sb.deleteCharAt(sb.length()-1);
                }
                else sb.append(ch);
            }
            return sb.toString();

        }
    }
}
