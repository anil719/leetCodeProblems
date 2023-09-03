class Solution {

    //  T.C --> O(n^2)      && S>C --> O(1)
    public String longestPalindrome(String str) {
        
		int n = str.length();
        if(n == 1) return str;
        
        String answer = "";
        
        for(int i = 0; i < n; i++){
            int low = i, high = i;
            while(low >= 0 && high < n && str.charAt(low) == str.charAt(high)){
                low --;
                high++;
            }
            String s1 = str.substring(low+1, high);
            if(s1.length() > answer.length()) answer = s1;
            
            low = i;
            high = i+1;
            while(low >= 0 && high < n && str.charAt(low) == str.charAt(high)){
                low --;
                high++;
            }
            String s2 = str.substring(low+1, high);
            if(s2.length() > answer.length()) answer = s2;
        }
        return answer;
    }
}