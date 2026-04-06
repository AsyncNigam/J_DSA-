package A_Practicing_revision;

import java.util.Arrays;

public class find_missing_repeted_values {
//    my approach
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;

        int[] temp = new int[n * n];

        // 1. Flatten into 1D
        int k = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                temp[k++] = grid[i][j];

        // 2. Sort the 1D array
        Arrays.sort(temp);

        int[] ans=new int[2];
        int sum=0;

        for(int i=0;i<temp.length-1;i++){
            if(temp[i]==temp[i+1])ans[0]=temp[i];
            sum+=temp[i];
        }

        int l=temp.length;
        sum+=temp[l-1];



        int res=l*(l+1)/2 + ans[0];

        ans[1]=res-sum;

        return ans;
    }
}
}
