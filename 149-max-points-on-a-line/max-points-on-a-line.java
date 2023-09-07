class Solution {
    public int maxPoints(int[][] points) {
        int ans = 0;
        for(int[] p1 : points){
            Map<Double, Integer> hm = new HashMap<>();
            for(int[] p2 : points){
                if(p1 == p2) continue;
                Double slope = 0.0;

                if(p1[0] == p2[0]) slope = Double.MAX_VALUE;
                else slope = (p2[1]-p1[1])/(double)(p2[0]-p1[0]) ;

                hm.put(slope, hm.getOrDefault(slope, 0)+1);
                ans = Math.max(ans, hm.get(slope));
            }
        }
        return ans+1;
    }
}











