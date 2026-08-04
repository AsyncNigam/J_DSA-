package Zeus_stroke.q2_bsearch;

public class q1_peak_index_in_a_mountain_array {
    class Solution {

//        my approach is taking the template on eof binary search where s=m+1 , e=m-1; sp i have keep the s<=e
        public int peakIndexInMountainArray(int[] arr) {
            int s=0;
            int e=arr.length-1;
            while(s<=e){
                int m=s+(e-s)/2;
                if((m!=0 && arr[m-1]<=arr[m]) && (m!=arr.length-1 && arr[m]<=arr[m+1]))s=m+1;

                else if(m==0  &&  arr[m]<=arr[m+1])s=m+1;

                else if((m!=0 && arr[m-1]>=arr[m]) && (m!=arr.length-1 && arr[m]>=arr[m+1]))e=m-1;

                else if(m==arr.length-1 && arr[m-1]>=arr[m])e=m-1;
                else if((m!=0 && arr[m-1]<=arr[m]) && (m!=arr.length-1 && arr[m]>=arr[m+1]))return m;

            }

            return s;

        }
    }


//    the short simple solution is

    public int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int m = s + (e - s) / 2;

            if (arr[m] < arr[m + 1]) {
                // we are in the increasing part of the mountain
                s = m + 1;
            } else {
                // we are in the decreasing part or at the peak
                e = m;
            }
        }

        // s and e will converge to the peak index
        return s;
    }

}
