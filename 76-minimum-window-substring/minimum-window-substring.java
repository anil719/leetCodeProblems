class Solution {
    public String minWindow(String s, String t) {
        int n = s.length(), m = t.length();
        int[] tFreq = new int[123];
        int answer = Integer.MAX_VALUE;
        for(char ch : t.toCharArray()){
            tFreq[ch]++;
        }

        int start = 0, end = 0;
        int startId= -1, endId = -1;
        int[] sFreq = new int[123];

        while(end < n){
            char ch = s.charAt(end);
            sFreq[ch]++;
            end ++;
            while(start < end && isValid(tFreq, sFreq)){
                if(end-start < answer){
                    answer = end-start;
                    startId =start;
                    endId = end;
                }
                sFreq[s.charAt(start)]--;
                start++;
            }
        }

        if(answer == Integer.MAX_VALUE) return "";
        return s.substring(startId, endId);
    }

    public boolean isValid(int[] a, int[] b){

        for(int i = 0; i < 123; i++){
            if(a[i] > b[i]) return false;
        }
        return true;
    }
}