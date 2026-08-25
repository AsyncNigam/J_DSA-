package Zeus_stroke.q6_heap;

//https://leetcode.com/problems/kth-smallest-amount-with-single-denomination-combination/description/?envType=daily-question&envId=2026-08-21

import java.util.Arrays;
import java.util.PriorityQueue;

public class q1_leetcode_3116 {

//     will give you tle because tc is k*O(n)

//    class Solution {
//        static class Node{
//            long val;
//            int idx;
//            Node(long val,int idx){
//                this.val=val;
//                this.idx=idx;
//            }
//        }
//        public long findKthSmallest(int[] coins, int k) {
//            int n=coins.length;
//
//            int[] pointer=new int[n];
//            Arrays.fill(pointer,1);
//
//            PriorityQueue<Node> pq=new PriorityQueue<>(
//                    (a,b) -> Long.compare(a.val, b.val)
//            );
//
//            for(int i=0;i<n;i++){
//                pq.add(new Node((long) coins[i], i));
//            }
//
//            long last=-1;
//            int count=0;
//
//            while(count<k){
//                Node curr=pq.poll();
//
//                if(curr.val!=last){
//                    last=curr.val;
//                    count++;
//                }
//
//                pointer[curr.idx]++;
//
//                long nextValue=(long) coins[curr.idx]* pointer[curr.idx];
//                pq.add(new Node(nextValue, curr.idx));
//            }
//            return last;
//        }
//    }


    class Solution {

        public long findKthSmallest(int[] coins, int k) {

            long left = 1;

            long right = Long.MAX_VALUE;

            // The kth number cannot be greater than
            // smallest_coin * k
            for (int coin : coins) {
                right = Math.min(right, (long) coin * k);
            }

            while (left < right) {

                long mid = left + (right - left) / 2;

                if (count(mid, coins) >= k) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }

            return left;
        }

        private long count(long x, int[] coins) {

            int n = coins.length;
            long result = 0;

            // Generate every non-empty subset
            for (int mask = 1; mask < (1 << n); mask++) {

                long lcm = 1;
                int bits = 0;

                for (int i = 0; i < n; i++) {

                    if ((mask & (1 << i)) != 0) {

                        bits++;

                        lcm = lcm(lcm, coins[i]);

                        // No multiple of this LCM can be <= x
                        if (lcm > x) {
                            break;
                        }
                    }
                }

                long value = x / lcm;

                // Odd number of coins -> ADD
                if (bits % 2 == 1) {
                    result += value;
                }
                // Even number of coins -> SUBTRACT
                else {
                    result -= value;
                }
            }

            return result;
        }


        private long lcm(long a, long b) {
            return a / gcd(a, b) * b;
        }

        private long gcd(long a, long b) {

            while (b != 0) {

                long temp = a % b;
                a = b;
                b = temp;
            }

            return a;
        }
    }

}
