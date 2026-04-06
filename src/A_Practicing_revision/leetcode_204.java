package A_Practicing_revision;

public class leetcode_204 {

//    brute force approach , but this has time limit exceeded

//    class Solution {
//        public int countPrimes(int n) {
//            int c=0;
//            for(int i=0;i<n;i++){
//                if(isPrime(i))c++;
//            }
//            return c;
//        }
//         boolean isPrime(int n){
//        if(n<2)return false;
//        for(int i=2;i*i<=n;i++){
//            if(n%i==0)return false;
//        }
//        return true;
//    }
//    }

//    sieve of eratosthenes approach
class Solution {
    public int countPrimes(int n) {
        int[] prime=new int[n];
        int c=0;
        for(int i=2;i<n;i++){
            if(prime[i]==0){
                c++;
                for(long j=(long)i*i;j<n;j+=i){
                    prime[(int)j]=1;
                }
            }
        }
        return c;
    }
}

}
