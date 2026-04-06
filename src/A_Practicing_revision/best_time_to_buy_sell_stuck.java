package A_Practicing_revision;

public class best_time_to_buy_sell_stuck {

//

//    brute force approach but it is time limit exceed

//class Solution {
//    public int maxProfit(int[] prices) {
//        int max=0;
//        for(int i=0;i<prices.length-1;i++){ int m=0;
//            for(int j=i+1;j<prices.length;j++){
//                m=Math.max(m,prices[j]-prices[i]);
//            }
//            max=Math.max(max,m);
//        }
//        return max;
//    }
//}


//    optimal answer by maintaing the minimum buying date and comparing with the current date . treating each date as a selling day
class Solution {
    public int maxProfit(int[] prices) {
        int min_buy=prices[0];
        int max_profit=0;
        for(int prc:prices){
            min_buy=Math.min(min_buy,prc);
            max_profit=Math.max(max_profit,prc-min_buy);
        }
        return max_profit;
    }
}
}
