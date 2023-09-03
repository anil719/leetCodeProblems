class Solution {
    public boolean isPalindrome(int x) {
     
        int copi = x;
        int rev = 0;
        while(x > 0){
            int dig = x % 10;
            rev = rev * 10 + dig;
            x = x/10;
        }
        return copi == rev;

    }
}