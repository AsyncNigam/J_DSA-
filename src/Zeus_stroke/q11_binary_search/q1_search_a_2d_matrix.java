package Zeus_stroke.q11_binary_search;

//https://leetcode.com/problems/search-a-2d-matrix/

public class q1_search_a_2d_matrix {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            if (matrix == null || matrix.length == 0) return false;

            int n=matrix.length;
            int m=matrix[0].length;

            int s=0;
            int e=(m*n)-1;
            while(s<=e){
                int mid=s+(e-s)/2;
                int mid_ele=matrix[mid/m][mid%m];
                if(mid_ele==target)return true;
                else if(mid_ele<target)s=mid+1;
                else e=mid-1;
            }
            return false;
        }
    }
}
