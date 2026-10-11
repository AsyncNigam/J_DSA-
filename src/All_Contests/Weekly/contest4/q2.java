package All_Contests.Weekly.contest4;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/contest/weekly-contest-523/problems/prime-subset-selection-i/
public class q2 {
    class Solution {
        public List<Integer> maxPrimes(int n, int s) {
            List<Integer> ans =new ArrayList<>();
            if(n<2)return ans;
            boolean[] is_composite=new boolean[n+1];
            for(int i=2;i*i<=n;i++){
                if(!is_composite[i]){
                    for(int j=i*i;j<=n;j+=i)is_composite[j]=true;
                }
            }
            long sum=0;
            for(int i=2;i<=n;i++){
                if(!is_composite[i]){
                    if((sum+i)<=s){
                        ans.add(i);
                        sum+=i;
                    }
                    else break;
                }
            }
            return ans;
        }
    }
}
