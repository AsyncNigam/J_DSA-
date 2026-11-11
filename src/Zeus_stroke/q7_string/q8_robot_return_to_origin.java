package Zeus_stroke.q7_string;

public class q8_robot_return_to_origin {
    class Solution {
        public boolean judgeCircle(String moves) {
            int h=0, v=0;
            for(int i=0;i<moves.length();i++){
                switch(moves.charAt(i)){
                    case 'U'->v++;
                    case 'D'->v--;
                    case 'R'->h++;
                    case 'L'->h--;
                }
            }
            return h==0 && v==0;
        }
    }
}
