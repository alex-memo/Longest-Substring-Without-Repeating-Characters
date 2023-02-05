import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int n = s.length();
        int maxLen = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (!charSet.contains(s.charAt(j))) {
                charSet.add(s.charAt(j++));
                maxLen = Math.max(maxLen, j - i);
            } else {
                charSet.remove(s.charAt(i++));
            }
        }
        return maxLen;
    }
}
