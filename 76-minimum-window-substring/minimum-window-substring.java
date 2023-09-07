class Solution {

    public String minWindow(String s, String t) {
       int answer = Integer.MAX_VALUE;

       int[] freqTstring = new int[123];
       for(char ch : t.toCharArray()) freqTstring[ch]++;

       int start = 0, end = 0;
       int startIdx = -1, endIdx = -1;
       int n = s.length();

       int[] freqSstring = new int[123];
       while(end < n){
           char ch = s.charAt(end);
           freqSstring[ch]++;
           end ++;
           while(start < end && validWindow(freqTstring, freqSstring)){
               if(end-start < answer){
                   answer = end-start;
                   startIdx = start ;
                   endIdx = end;
               }
               freqSstring[s.charAt(start)]--;
               start ++;
           }
       }
       if(answer == Integer.MAX_VALUE) return "";
       return s.substring(startIdx, endIdx);
    }

    public boolean validWindow(int[] tfreq, int[] sfreq){
        for(int i = 0; i < 123; i++){
            if(tfreq[i] > sfreq[i]) return false;
        }
        return true;
    }
}