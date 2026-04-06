package A_Practicing_revision;

public class leetcode_2839 {
//    my approach
//class Solution {
//    public boolean canBeEqual(String s1, String s2) {
//        if(s1.equals(s2))return true;
//        char[] ch=s2.toCharArray();
//        for(int i=0;i<2;i++){
//            swap(ch,i,i+2);
//            if(new String(ch).equals(s1))return true;
//            swap(ch,i,i+2);
//        }
//
//        swap(ch,0,2);
//        swap(ch,1,3);
//        if(new String(ch).equals(s1))return true;
//        return false;
//    }
//    void swap(char[] ch,int i,int j){
//        char t=ch[i];
//        ch[i]=ch[j];
//        ch[j]=t;
//    }
//}

//    best approach
class Solution {
    public boolean canBeEqual(String s1, String s2) {
        // Check even indices (0 and 2)
        boolean even = (s1.charAt(0) == s2.charAt(0) && s1.charAt(2) == s2.charAt(2)) ||
                (s1.charAt(0) == s2.charAt(2) && s1.charAt(2) == s2.charAt(0));

        // Check odd indices (1 and 3)
        boolean odd = (s1.charAt(1) == s2.charAt(1) && s1.charAt(3) == s2.charAt(3)) ||
                (s1.charAt(1) == s2.charAt(3) && s1.charAt(3) == s2.charAt(1));

        return even && odd;
    }
}

}
