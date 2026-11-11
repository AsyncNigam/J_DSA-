package Zeus_stroke.q7_string;

public class q6_decrypt_string_from_alphabet_to_integer_mapping {
    class Solution {
        public String freqAlphabets(String s) {
            StringBuilder sb=new StringBuilder();
            int i=0;
            while(i<s.length()){
                if(i+2<s.length() && s.charAt(i+2)=='#'){
                    int num=Integer.parseInt(s.substring(i,i+2));
                    sb.append((char)('a'+num-1));
                    i+=3;
                }
                else{
                    int num=s.charAt(i)-'0';
                    sb.append((char)('a'+num-1));
                    i++;
                }
            }
            return sb.toString();
        }
    }
}
