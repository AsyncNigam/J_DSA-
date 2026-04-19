package DYNAMIC_PROGRAMMING;

public class ques_07_climbing_stairs {
    class Solution {
        public int climbStairs(int count) {
            int num1=1;
            int num2=2;
            if(count==2)return 2;
            if(count==1)return 1;

            for (int i = 2; i < count; i++) {
                int sumOfPrevTwo = num1 + num2;
                num1 = num2;
                num2 = sumOfPrevTwo;
            }
            return num2;
        }

    }
}
