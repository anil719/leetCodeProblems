class Solution {
    public boolean isAnagram(String s, String t) {
       /*
        int[] freq = new int[26];
        if(s.length() != t.length()) return false;

        for(char ch : s.toCharArray()) freq[ch-'a']++;

         for(char ch : t.toCharArray()) freq[ch-'a']--;

         for(int i : freq) if(i != 0) return false;

         return true;

         */
       
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> countMap = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (!countMap.containsKey(c) || countMap.get(c) <= 0) {
                return false;
            }
            countMap.put(c, countMap.get(c) - 1);
        }
        return true;
    }
}