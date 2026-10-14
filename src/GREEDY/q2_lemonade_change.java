package GREEDY;

//https://leetcode.com/problems/lemonade-change/
public class q2_lemonade_change {
    class Solution {
        public boolean lemonadeChange(int[] bills) {
            int five=0;
            int ten=0;
            int twenty=0;
            for(int ele:bills){
                if(ele==5)five++;
                else if(ele==10){
                    if(five>0){
                        five--;
                        ten++;
                    }
                    else return false;
                }
                else if(ele==20){
                    if(ten>0 && five>0){
                        five--;
                        ten--;
                        twenty++;
                    }
                    else if(five>=3){
                        five-=3;
                        twenty++;
                    }
                    else return false;
                }
            }
            return true;
        }
    }
}
