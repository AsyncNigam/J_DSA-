package Zeus_stroke.q7_string;

public class q7_excel_sheet_column_title {
    class Solution {
        public String convertToTitle(int col) {
            StringBuilder sb=new StringBuilder();
            while(col>0){
                col--; // because in question given that 1 euivalent to A but in approach we are doing %26 so ) will be equivalent to A
                sb.append((char)('A'+col%26));
                col/=26;
            }
            return sb.reverse().toString();
        }
    }
}
