package Apna_clg_sheet_revision;

public class reverse_words_in_string {

//    this is my approach but it is incomplete because it can not trim the inbetween spaces


//    class Solution {
//        public String reverseWords(String s) {
//            StringBuilder str=new StringBuilder(s.trim());
//            str.reverse();
//            int sidx=0;
//            for(int i=0;i<str.length();i++){
//                if(str.charAt(i)==' '){
//                    reverse(str,sidx,i-1);
//                    sidx=i+1;
//                }
//                if(i==str.length()-1)reverse(str,sidx,i);
//            }
//            return str.toString();
//        }
//        void reverse(StringBuilder str,int s,int e){
//            for(int i=s,j=e;i<j;i++,j--){
//                char temp=str.charAt(i);
//                str.setCharAt(i,str.charAt(j));
//                str.setCharAt(j,temp);
//            }
//        }
//    }

//    the best approach is to split the string into words array , then reverse individual word

    class Solution {
        public String reverseWords(String s) {
            String[] words = s.trim().split("\\s+");
            StringBuilder str=new StringBuilder();

            for(int i=words.length-1;i>=0;i--){
                str.append(words[i]);
                if(i>0)str.append(" ");
            }
            return str.toString();
        }
    }
}





//🧩 Understanding \\s+ in Java
//When reversing words in a string, using a simple space " " to split text often fails if there are multiple spaces. Instead, we use the Regular Expression (Regex) \\s+.
//1. Breakdown of the Pattern
//Component	Meaning
//\s	Whitespace character: Matches spaces, tabs (\t), and newlines (\n).
//+	Quantifier: Matches one or more of the preceding element.
//\\	Java Escape: Required to tell Java to treat the backslash as a literal character.
//2. Why the Double Backslash \\?
//In Java, the backslash \ is an Escape Character. It tells the compiler that the following character has a special meaning (like \n for a new line).
//The Problem: If you write "\s", Java tries to find a special command named \s. Since that doesn't exist in standard Java strings, it throws an error.
//The Solution: To send a literal backslash to the Regex Engine, you must "escape" the backslash with another backslash.
//You type: \\s
//Java sees: \s
//Regex Engine receives: \s (and knows to look for a space).
//3. Comparison: " " vs "\\s+"
//Imagine the input string is: "Sky Blue" (with 3 spaces).
//Method	Resulting Array	Why?
//split(" ")	["Sky", "", "", "Blue"]	It splits at every single space, creating empty strings for the extras.
//split("\\s+")	["Sky", "Blue"]	It sees the "chunk" of 3 spaces as one single divider and removes it all.
//4. Implementation Example
//java
//public String reverseWords(String s) {
//    // .trim() removes outer spaces
//    // .split("\\s+") handles any number of inner spaces/tabs
//    String[] words = s.trim().split("\\s+");
//
//    StringBuilder sb = new StringBuilder();
//    for (int i = words.length - 1; i >= 0; i--) {
//        sb.append(words[i]);
//        if (i > 0) sb.append(" ");
//    }
//    return sb.toString();
//}
