package A_Practicing_revision.leetcode_daily;

public class  leetcode_day_1{

//    https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/description/



//    this is my brute force approach

//    class Solution {
//        public int minOperations(String s) {
//            String str0="";
//            String str1="";
//            for(int i=0;i<s.length();i++){
//                if(i%2==0){
//                    str0+="0";
//                    str1+="1";
//                }
//                else{
//                    str0+="1";
//                    str1+="0";
//                }
//            }
//
//            int c0=0;
//            int c1=0;
//            for(int i=0;i<s.length();i++){
//                if(s.charAt(i)!=str0.charAt(i))c0++;
//                if(s.charAt(i)!=str1.charAt(i))c1++;
//            }
//            return Math.min(c1,c0);
//        }
//    }


//    rather than creating a new string creating just knowing the sequence and checking witht he stat like is better it will use 1 for loop
//    class Solution {
//    public int minOperations(String s) {
//        int c0=0;
//        int c1=0;
//       for(int i=0;i<s.length();i++){
//            char s0=(i%2==0)? '0' : '1';
//             char s1=(i%2==0)? '1' : '0';
//            if(s.charAt(i)!=s0)c0++;
//           if(s.charAt(i)!=s1) c1++;
//       }
//       return Math.min(c1,c0);
//    }
//}



//    the best approach is finding the requirement to change to one only and another with substraction
class Solution {
    public int minOperations(String s) {
        int c0=0;
        for(int i=0;i<s.length();i++){
            char s0=(i%2==0)? '0' : '1';
            if(s.charAt(i)!=s0)c0++;
        }
        return Math.min(c0,s.length()-c0);
    }
}

}
