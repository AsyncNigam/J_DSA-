package DYNAMIC_PROGRAMMING_02;

import java.util.ArrayList;

public class q5_rotate_string {
//    my approach
//    class Solution {
//        public boolean rotateString(String s, String goal) {
//            if(s.length()!=goal.length())return false;
//            ArrayList<Integer> arr=getIdx(goal,s.charAt(0));
//            if(arr.get(0)==-1)return false;
//            boolean flag=false;
//            for(int i=0;i<arr.size();i++){
//                flag=flag || check(s,goal,0,arr.get(i));
//            }
//            return flag;
//        }
//        ArrayList<Integer> getIdx(String s, char ch){
//            ArrayList<Integer> arr=new ArrayList<Integer>();
//            boolean flag=false;
//            for(int i=0;i<s.length();i++){
//                if(s.charAt(i)==ch){arr.add(i);
//                    flag=true;}
//            }
//            if(! flag) arr.add(-1);
//            return arr;
//
//        }
//        boolean check(String s,String s2,int i,int j){
//            if(i==s.length())return true;
//            if(j==s2.length())return check(s,s2,i,0);
//            if(s.charAt(i)!=s2.charAt(j))return false;
//            return check(s,s2,i+1,j+1);
//        }
//    }


//    by more concise likely the concatenation of s+s will contain all the rotation of s, and goal will always be the substring of that if possible
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
        return (s+s).contains(goal);
    }
}
}
