package Leetcode_75;

import java.util.ArrayDeque;
import java.util.Queue;

public class q16_dota2_senate {
    class Solution {
        public String predictPartyVictory(String s) {
            int n=s.length();
            Queue<Integer> qd=new ArrayDeque<>();
            Queue<Integer> qr=new ArrayDeque<>();
            for(int i=0;i<n;i++){
                char ch=s.charAt(i);
                if(ch=='R')qr.add(i);
                else qd.add(i);
            }
            while(!qd.isEmpty() && !qr.isEmpty()){
                int id=qd.remove();
                int ir=qr.remove();
                if(id<ir)qd.add(id+n);
                else qr.add(ir+n);
            }
            if(qd.isEmpty())return "Radiant";
            return "Dire";
        }
    }
}
