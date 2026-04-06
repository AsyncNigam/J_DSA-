package A_Practicing_revision;

public class special_position_in_binary_matrix {


//    brute force approach with O(n^3)



//    class Solution {
//        public int numSpecial(int[][] mat) {
//            int c=0;
//            for(int i=0;i<mat.length;i++){
//                for(int j=0;j<mat[i].length;j++){
//                    if(mat[i][j]==1 && isColumnSpecial(j,mat) && isRowSpecial(i,mat)) c++;
//                }
//            }
//            return c;
//
//        }
//        boolean isColumnSpecial(int j,int[][] mat){
//            int c=0;
//            for(int i=0;i<mat.length;i++){
//                if(mat[i][j]==1)c++;
//            }
//            if(c==1)return true;
//            return false;
//        }
//        boolean isRowSpecial(int i,int[][] mat){
//            int c=0;
//            for(int j=0;j<mat[i].length;j++){
//                if(mat[i][j]==1)c++;
//            }
//            if(c==1)return true;
//            return false;
//        }
//    }



//  optimal solution with 0(n^2)
    class Solution {
        public int numSpecial(int[][] mat) {
            int c = 0;
            for (int i = 0; i < mat.length; i++) {
                int idx = isRow(i, mat);
                // Only check the column if the row has exactly one '1'
                if (idx != -1 && isCol(idx, mat)) {
                    c++;
                }
            }
            return c;
        }

        int isRow(int i, int[][] mat) {
            int res = -1;
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                    res = j;
                }
                // Optimization: If more than one '1' is found, it's not special
                if (count > 1) return -1;
            }
            return (count == 1) ? res : -1;
        }

        boolean isCol(int j, int[][] mat) {
            int count = 0;
            for (int i = 0; i < mat.length; i++) {
                if (mat[i][j] == 1) {
                    count++;
                }
                // Optimization: If more than one '1' is found, it's not special
                if (count > 1) return false;
            }
            return count == 1;
        }
    }

}
