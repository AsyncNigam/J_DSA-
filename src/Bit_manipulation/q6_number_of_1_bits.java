package Bit_manipulation;

public class q6_number_of_1_bits {

//     brute force

//    here time complexity is O(logn) because the time complexity of Integer.toBinaryString(n); is O(logn) and the for loop runs O(logn ) times , because the length of the binary string is log2n , n is the decimal number right

//    space complexity is O(1) constant

    class Solution1 {
        public int hammingWeight(int n) {
            String binary=Integer.toBinaryString(n);
            int count =0;
            for(int i=0;i<binary.length();i++){
                if(binary.charAt(i)=='1')count++;
            }
            return count;
        }
    }

//    another brute force solution
//    here also the time complexity is O(log n) not O(n) because we are right shifting the n which will take the loop only logn iterations rather than n
//     tc is O(logn) and sc is O(1)

    class Solution2 {
            public int hammingWeight(int n) {
                int count=0;
                while(n>0){
                    count+=n & 1;
                    n=n>>1;
                }
                return count;
            }
        }

//  the optimal solution is tc is O(k) k is the number of set bits , as logn is the number of bits, and we are only using selective bits which are set it is best solution . SC id O(1)

    class Solution3 {
        public int hammingWeight(int n) {
            int count=0;
            while(n>0){
                int rmsb=n & -n; // right most set bit by n& (-n) // 2s complement
                n=n-rmsb;
                count++;
            }
            return count;
        }
    }

//    another way is Function to count the number of set bits (1s) in the binary representation of n using Brian Kernighan's Algorithm

    class Solution4 {
        public int hammingWeight(int n) {
            int count=0;
            while(n>0){
                n=n&(n-1); // here by using bitwise & , the elements after the right most set bit will toggle resulting the right most set bit erase and thats why count increases
                count++;
            }
            return count;
        }
    }


}
