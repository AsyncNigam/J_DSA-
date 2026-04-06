package A_Practicing_revision;

//https://leetcode.com/problems/valid-palindrome/


//here we don't need to create new string or builder for checking just keeping the pointer and continuing is the key



public class valid_palindrome {
    class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char left=s.charAt(i);
            char right=s.charAt(j);

            if(!Character.isLetterOrDigit(left) || !Character.isLetterOrDigit(right)){
                if(!Character.isLetterOrDigit(left))i++;
                if(!Character.isLetterOrDigit(right))j--;
            }

           else if(Character.toLowerCase(left)!=Character.toLowerCase(right))return false;
            else{
                i++;
                j--;
            }

        }
        return true;

    }
}
}
