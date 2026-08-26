package Zeus_stroke.q7_string;

//https://leetcode.com/problems/shortest-and-lexicographically-smallest-beautiful-string/?envType=daily-question&envId=2026-08-26

public class q1_shortest_lexographically_smallest_beautiful_string {
    class Solution {

//        The expression and.compareTo(res) < 0 checks if the object or string and is less than, or comes before, res in a sorted (lexicographical or numerical) order.How compareTo() WorksNegative number (< 0): The first value (and) is less than the second value (res).Zero (== 0): Both values are equal.Positive number (> 0): The first value (and) is greater than the second value (res).


        public String shortestBeautifulSubstring(String s, int k) {
            int min=Integer.MAX_VALUE;
            String res="";
            for(int i=0;i<s.length();i++){
                int sum=0;
                int c=0;
                String ans="";
                for(int j=i;j<s.length();j++){
                    char ch=s.charAt(j);
                    c++;
                    ans+=ch;
                    if(ch=='1')sum++;
                    if(sum>k)break;
                    if(sum==k){
                        if(min>c || min==c && ans.compareTo(res)<0){
                            min=c;
                            res=ans;
                        }
                    }
                }
            }
            return res;
        }
    }
}
