package A_Practicing_revision;

public class leetcode_567_permuitation {
    static void main() {

    }
    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            int[] s1F=freq(s1,0,s1.length());
            for(int i=0;i<=s2.length()-s1.length();i++){
                int[] s2F=freq(s2,i,i+s1.length());
                if(isSame(s1F,s2F))return true;
            }
            return false;
        }

        boolean isSame(int[] a,int[] b){
            int i=0;
            int j=0;
            while(i<a.length && j<b.length){
                if(a[i]!=b[i])return false;
                i++;
                j++;
            }
            return true;
        }
        int[] freq(String str,int s,int e){
            int[] f=new int[26];
            for(int i=s;i<e;i++){
                f[str.charAt(i)-'a']+=1;
            }
            return f;
        }
    }
}
