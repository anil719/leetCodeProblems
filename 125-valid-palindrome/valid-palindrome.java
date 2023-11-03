class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(Character.isUpperCase(ch)|| Character.isLowerCase(ch) || Character.isDigit(ch)) sb.append(ch);
        }

        String str = sb.toString().toLowerCase();
        return isPal(str);
    }
    public boolean isPal(String str){
        int n = str.length();

        for(int i = 0; i < n/2; i++){
            if(str.charAt(i) != str.charAt(n-i-1)) return false;
        }
        return true;
    }
}