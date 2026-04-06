package A_Practicing_revision;

public class leetcode_257_robot_return_to_origin {
    class Solution {
        public boolean judgeCircle(String moves) {
            char[] arr=moves.toCharArray();
            int num=0;
            for(char ch:arr){
                if(ch=='U')num+=1;
                else if(ch=='D')num+=-1;
                else if (ch=='L') num+=200;
                else num+=-200;
            }
            return num==0;
        }
    }
}
