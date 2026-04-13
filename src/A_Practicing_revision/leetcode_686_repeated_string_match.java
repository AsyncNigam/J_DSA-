package A_Practicing_revision;

public class leetcode_686_repeated_string_match {
    class Solution {
        public int repeatedStringMatch(String a, String b) {
            if(b.length()==0)return 0;
            StringBuilder sb=new StringBuilder(a);
            int count=1;
            while(sb.length()<=a.length() + b.length()){
                if(sb.indexOf(b)!=-1)return count;

                sb.append(a);
                count++;

                if(sb.indexOf(b)!=-1)return count;
                
            }


            return -1;
        }
    }
}
