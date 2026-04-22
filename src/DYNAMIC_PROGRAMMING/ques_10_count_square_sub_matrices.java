package DYNAMIC_PROGRAMMING;

public class ques_10_count_square_sub_matrices {
    class Solution {
        public int countSquares(int[][] arr) {
            int m=arr.length;
            int n=arr[0].length;
            int count=0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(arr[i][j]==1){  //this all are only for 1 ,or you can do like if 0 comes continue
                        if(i>0 && j>0){
                            arr[i][j]+=Math.min(arr[i-1][j-1],Math.min(arr[i-1][j],arr[i][j-1]));
                        }
                        count+=arr[i][j];
                    }
                }
            }
            return count;
        }
    }
}
