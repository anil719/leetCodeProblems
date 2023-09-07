import java.util.HashMap;

public class Solution {
    public int longestSubstring(String s, int k) {
    //    int n = s.length();
    //    if(n < k) return 0;

    //    int ans = 0;
    //    int[] freq = new int[26];
    //    for(char ch : s.toCharArray()) freq[ch-'a']++;

    //    for(int i = 0; i < n; i++){
    //        char ch = s.charAt(i);
    //        if(freq[ch- 'a'] < k){
    //            int s1 = longestSubstring(s.substring(0, i), k);
    //            int s2 = longestSubstring(s.substring(i+1), k);
    //            int len = Math.max(s1, s2);
    //            return len;
    //        }
    //    }

    //    return n;

        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character that is invalid (frequency < k)
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freqMap.get(c) < k) {
                int left = longestSubstring(s.substring(0, i), k);
                int right = longestSubstring(s.substring(i + 1), k);
                return Math.max(left, right);
            }
        }

        // All characters are valid, so the whole string is the longest substring
        return s.length();
    }   
}
