class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{' ) st.push(ch);
            else {
                if(st.isEmpty()) return false;
                if(match(st.peek(), ch)) st.pop();
                else return false;
            }
        }
        if(!st.isEmpty()) return false;

        return true;
    }
    public boolean match(char ch1, char ch2){
        if(ch1 == '[' && ch2 == ']') return true;
         if(ch1 == '(' && ch2 == ')') return true;
          if(ch1 == '{' && ch2 == '}') return true;
         return false; 
    }
}