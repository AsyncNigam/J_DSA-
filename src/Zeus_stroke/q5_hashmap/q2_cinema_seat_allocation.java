package Zeus_stroke.q5_hashmap;

public class q2_cinema_seat_allocation {
//    wrong approach


//    class Solution {
//    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
//        HashMap<Integer, Integer> map=new HashMap<>();
//        for(int[] arr:reservedSeats){
//           map.put(arr[0],arr[1]);
//        }
//        int c=0;
//        for(int i=1;i<=n;i++){
//
//            boolean g1=true;
//            boolean g2=true;
//            boolean g3=true;
//            for(int j=2;j<4;j++){
//                if(map.containsKey(i) && map.get(i).equals(j))g1=false;
//            }
//            for(int j=4;j<6;j++){
//                 if(map.containsKey(i) && map.get(i).equals(j)){
//                    g1=false;
//                    g3=false;
//                   }
//            }
//             for(int j=6;j<8;j++){
//                 if(map.containsKey(i) && map.get(i).equals(j)){
//                     g2=false;
//                    g3=false;
//                 }
//                 }
//
//            for(int j=8;j<10;j++){
//                 if(map.containsKey(i) && map.get(i).equals(j))g2=false;
//            }
//
//            if((!g1 && g3) || (!g2 && g3))c++;
//            if(!g3 && g1)c++;
//            if(!g3 && g2)c++;
//        }
//        return c;
//
//    }
//}
}
