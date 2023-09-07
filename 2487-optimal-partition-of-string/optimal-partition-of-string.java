class Solution {
    public int partitionString(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int cnt = 0;
        
        for(char ch : s.toCharArray()){
            if(!set.contains(ch)) set.add(ch);
            else{
                set = new HashSet<>();
                set.add(ch);
                cnt ++;
            }
        }

        if(!set.isEmpty()) cnt++;
        return cnt;
    }
}