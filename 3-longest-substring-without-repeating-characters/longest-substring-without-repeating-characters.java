class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length();
        String ans = "";
        HashSet<Character> set = new HashSet<>();
        int start = 0, end = 0;
        while(end < n){
            char ch = s.charAt(end) ;
            while(set.contains(ch)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(ch);
            if(end - start +1 > ans.length()){
                ans = s.substring(start, end+1);
            }
            end ++;
        }
        return ans.length();

    }
}