package GREEDY;

import java.util.Arrays;
//https://leetcode.com/problems/assign-cookies/
//https://youtu.be/DIX2p7vb9co?si=pF3Om48fmKofjcCO

// in greedy we will solve questions greedily that we will try to give as less as possible to only satisfy

public class q1_assign_cookies {
    class Solution {
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            int i=0;
            int j=0;
            int count=0;
            while(i<g.length && j<s.length){
                if(s[j]>=g[i]){
                    i++;
                    j++;
                    count++;
                }
                else j++;
            }
            return count;
        }
    }
}
