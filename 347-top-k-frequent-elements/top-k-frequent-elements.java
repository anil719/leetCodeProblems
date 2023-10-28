class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm  = new HashMap<>();
        for(int i : nums) hm.put(i, hm.getOrDefault(i, 0)+1);

        // PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(hm.get(a),hm.get(b)));

        // for(int key : hm.keySet()){
        //     pq.add(key);
        //     if(pq.size() > k) pq.poll();
        // }

        // int[] result = new int[k];
        // int i = 0;
        // while(!pq.isEmpty()){
        //     result[i] = pq.poll();
        //     i++;
        // }
        // return result;


        
        // ArrayList<Integer> answer = new ArrayList<>();
        // for(int i : hm.keySet()){
        //     if(hm.get(i) >= k ) answer.add(i);
        // } 

        // int[] res = new int[answer.size()];
        // for(int i = 0; i < answer.size(); i++) res[i] = answer.get(i);

        // return res;



         // Create a hashmap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create a list to store the unique elements
        List<Integer> uniqueElements = new ArrayList<>(frequencyMap.keySet());

        // Sort the unique elements by their frequencies in descending order
        Collections.sort(uniqueElements, (a, b) -> frequencyMap.get(b) - frequencyMap.get(a));

        // Create the result array with the top k frequent elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = uniqueElements.get(i);
        }

        return result;

    }
}