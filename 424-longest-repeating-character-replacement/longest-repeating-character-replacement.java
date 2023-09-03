class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int max_length = 0;
        int max_freq = 0;
        int[] freq_counter = new int[26]; // Assuming uppercase English letters
        
        int start = 0;
        int end = 0;
        while (end < n) {
            // Step 1: Expansion
            int charIndex = s.charAt(end) - 'A';
            freq_counter[charIndex]++;
            max_freq = Math.max(max_freq, freq_counter[charIndex]);
            
            // Step 2: Contraction
            while ((end - start + 1 - max_freq) > k) {                  // maximum replacements we can make would be --> n-maxFreq
                int startCharIndex = s.charAt(start) - 'A';
                freq_counter[startCharIndex]--;
                start++;
            }
            // Step 3: Update max_length
            max_length = Math.max(max_length, end - start + 1);
            
            // Increment end to expand the window
            end++;
        }
        
        return max_length;
    }
}