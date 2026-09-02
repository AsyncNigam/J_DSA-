package Zeus_stroke.q7_string;

//from striver sheet
public class q3_string_to_integer {
    class Solution {
        public int myAtoi(String s) {
            boolean head=true;
            boolean shead=true;
            int sign=1;
            int ans=0;
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch==' ' && shead)continue;
                if(ch=='0' && head){
                    shead=false;
                    continue;
                }
                if(ch=='+' && shead){
                    shead=false;
                    continue;

                }
                if(ch=='-' && shead){
                    sign=-1;
                    shead=false;
                    continue;
                }
                if(!Character.isDigit(ch))break;
                if(ch<='9' && ch>='0'){
                    int digit=ch-'0';
                    // Check boundaries before accumulating to prevent wrap-around
                    if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && digit > 7)) {
                        return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                    ans = ans * 10 + digit;
                    head=false;
                    shead=false;
                }
            }
            return sign*ans;
        }
    }
}
