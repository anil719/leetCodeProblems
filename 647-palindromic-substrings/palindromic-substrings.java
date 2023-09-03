// class Solution {
//     public int countSubstrings(String s) {
        

//         int cnt = 0;
//         int n = s.length();
//         for(int i = 0; i < n; i++){
//             for(int j = i; j < n; j++){
//                 String str = s.substring(i, j+1);
//                 if(pal(str)) cnt ++;
//             }
//         }
//         return cnt;
//     }

//     public boolean pal(String str){
//         int n = str.length();
//         for(int i = 0; i <= n/2; i++){
//             if(str.charAt(i) != str.charAt(n-i-1)) return false;
//         }
//         return true;
//     }
// }



class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            int low = i, high = i;
            
            // Check for odd-length palindromes
            while (low >= 0 && high < n && s.charAt(low) == s.charAt(high)) {
                count++;
                low--;
                high++;
            }
            
            low = i;
            high = i + 1;
            
            // Check for even-length palindromes
            while (low >= 0 && high < n && s.charAt(low) == s.charAt(high)) {
                count++;
                low--;
                high++;
            }
        }
        
        return count;
    }
}
