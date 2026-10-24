package All_Contests.Biweekly.contest3;

import java.util.Arrays;
//https://leetcode.com/problems/count-magical-substring-pairs-ii/
public class q4 {


    class Solution {
        public long countMagicalPairs(String s) {
            int n = s.length();
            int[][] firstRight = new int[n + 1][26];
            Arrays.fill(firstRight[n], n);

            for (int i = n - 1; i >= 0; i--) {
                System.arraycopy(firstRight[i + 1], 0, firstRight[i], 0, 26);
                firstRight[i][s.charAt(i) - 'a'] = i;
            }

            int[] lastLeft = new int[26];
            Arrays.fill(lastLeft, -1);
            long ans = 0;

            for (int j = 0; j < n - 1; j++) {
                lastLeft[s.charAt(j) - 'a'] = j;

                int[] leftArr = lastLeft.clone();
                Arrays.sort(leftArr);

                int[] rightArr = firstRight[j + 1].clone();
                Arrays.sort(rightArr);

                for (int d = 1; d <= 26; d++) {
                    int leftIdx = 26 - d;
                    int leftEnd = leftArr[leftIdx];
                    if (leftEnd == -1) break;
                    int leftStart = (leftIdx - 1 >= 0) ? leftArr[leftIdx - 1] : -1;
                    int leftCount = leftEnd - leftStart;

                    int rightIdx = d - 1;
                    int rightStart = rightArr[rightIdx];
                    if (rightStart == n) break;
                    int rightEnd = (rightIdx + 1 < 26) ? rightArr[rightIdx + 1] : n;
                    int rightCount = rightEnd - rightStart;


                    ans += (long) leftCount * rightCount;
                }
            }
            return ans;
        }
    }
}
