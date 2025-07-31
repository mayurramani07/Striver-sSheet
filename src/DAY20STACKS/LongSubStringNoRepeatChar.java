package DAY20STACKS;
import java.util.*;
public class LongSubStringNoRepeatChar {
    public static int LengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int right = 0;
        int left = 0;
        int maxLen = 0;

        while(right < s.length()) {
            char ch = s.charAt(right);
            if(!set.contains(ch)) {
                set.add(ch);
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            }
            else {
                set.remove(s.charAt(left));
                    left++;
            }
        }
        return maxLen;
    }
}
//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(n)