package Zeus_stroke;

import java.util.HashSet;

public class q4_check_if_n_and_its_double_exists {

//    my common approach
    class Solution {
        public boolean checkIfExist(int[] arr) {
            boolean is_zero=false;
            HashSet<Integer> map = new HashSet<>();
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==0 &&is_zero)return true;
                map.add(2 * arr[i]);
                if(arr[i]==0)is_zero=true;
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]!=0 && map.contains(arr[i]))
                    return true;
            }
            return false;

        }
    }

//    optimized one
class Solution2 {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> map = new HashSet<>();
        for(int el:arr){
            if(map.contains(2*el)||(el%2==0 && map.contains(el/2)))return true;
            map.add(el);
        }
        return false;

    }
}
}
