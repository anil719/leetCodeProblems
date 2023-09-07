class Solution {
    // public String longestNiceSubstring(String s) {
    //   int n = s.length();
    //   if(n < 2) return "";

    //   HashSet<Character> set = new HashSet<>();
    //   for(char ch : s.toCharArray()) set.add(ch);

    //   for(int i =0; i < n; i++){
    //       char ch = s.charAt(i);

    //       char lc = Character.toLowerCase(ch);
    //       char uc = Character.toUpperCase(ch);
    //       if(set.contains(lc) && set.contains(uc)) continue;

    //       String lp = longestNiceSubstring(s.substring(0, i));
    //       String rp = longestNiceSubstring(s.substring(i+1));
    //       String ans = lp.length() >= rp.length() ? lp : rp;
    //       return ans;
    //   }
    //   return s;
    // }


     public String longestNiceSubstring(String s) {
        String ans = "";
        int n = s.length();
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                String str = s.substring(i, j+1);
                if(nice(str) && str.length() > ans.length()) ans = str;
            }
        }
        return ans;
    }

    public boolean nice(String str){
       int[] fmap = new int[123];
       for(char ch : str.toCharArray()) fmap[ch]++;


       for(char ch : str.toCharArray()){
           if(Character.isUpperCase(ch) && fmap[ch+32] == 0) return false;

           if(Character.isLowerCase(ch) && fmap[ch-32] == 0) return false;
       }
       return true;
        
    }
}