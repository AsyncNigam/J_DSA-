package Zeus_stroke.q7_string;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class q9_split_strings_by_separator {
//    import java.util.regex.Pattern;
//    Leetcode actually does auto-include some inbuilt imports. Like in Leetcode server, they have already included `java.util.*` and that `util.*` brings the common classes integer Character or arraylist. It doesn't include the regex so for the regex we need to explicitly write this import statement.


    class Solution {
        public List<String> splitWordsBySeparator(List<String> words, char separator) {
            List<String> ans=new ArrayList<>();
            for(String word:words){
                String[] arr = word.split(Pattern.quote(String.valueOf(separator)));
//        For using this `split` method, generally giving a string to break that string into multiple strings, or containing a string array, is enough. Whenever we are going to use special characters like `.`, `/`, `$`, or those things which have a specific meaning (like `.` means any character, `/` means OR, and `$` is used in a lambda expression, etc.), there we explicitly need `\\`. This is because then the compiler knows that these are explicitly using characters, not symbols, and this is bad-tender code. Tell the compiler to use these as characters and as normal characters, not as symbols.
                for(String str: arr)if (!str.isEmpty())ans.add(str);
            }
            return ans;
        }
    }
}
