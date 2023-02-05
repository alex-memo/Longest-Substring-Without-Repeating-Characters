import java.util.*;

public class Solution {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        int n = s.length();
        int maxLen = 0, i = 0;
        for (int j = 0; j < n; j++) {
            if (charMap.containsKey(s.charAt(j))) {
                i = Math.max(i, charMap.get(s.charAt(j)) + 1);
            }
            charMap.put(s.charAt(j), j);
            maxLen = Math.max(maxLen, j - i + 1);
        }
        return maxLen;
    }
}

