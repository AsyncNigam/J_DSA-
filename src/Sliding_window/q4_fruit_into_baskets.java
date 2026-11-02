package Sliding_window;

public class q4_fruit_into_baskets {

    class Solution {
        public int totalFruit(int[] fruits) {
            int n = fruits.length;
            int i = 0;
            int max = 0;

            int t1 = -1;
            int t2 = -1;

            int lastType = -1;
            int lastCount = 0;

            for (int j = 0; j < n; j++) {

                if (fruits[j] == lastType) {
                    lastCount++;
                }
                else {
                    if (t1 == -1)
                        t1 = fruits[j];

                    else if (fruits[j] != t1 && t2 == -1)
                        t2 = fruits[j];

                    else if (fruits[j] != t1 && fruits[j] != t2) {
                        i = j - lastCount;
                        t1 = lastType;
                        t2 = fruits[j];
                    }

                    lastType = fruits[j];
                    lastCount = 1;
                }

                max = Math.max(max, j - i + 1);
            }

            return max;
        }
    }

}
