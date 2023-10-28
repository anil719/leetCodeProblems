class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      List<List<String>> res = new ArrayList<>();
      
      Map<Map<Character, Integer>, List<String>> hm = new HashMap<>();
      for(String s : strs){

          Map<Character, Integer> khm = new HashMap<>();
          for(char ch : s.toCharArray()) khm.put(ch, khm.getOrDefault(ch, 0)+1);
          
          if(!hm.containsKey(khm)){
              List<String> kv = new ArrayList<>();
              kv.add(s);
              hm.put(khm, kv);
          }else{
              List<String> temp = hm.get(khm);
              temp.add(s);
              hm.put(khm, temp);
          }
      }
      for(List<String> key : hm.values()){
          res.add(key);
      }
        return res;
    }
}