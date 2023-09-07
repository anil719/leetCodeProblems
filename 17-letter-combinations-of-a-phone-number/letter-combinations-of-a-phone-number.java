class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return new ArrayList<>();
        ArrayList<String> ans = new ArrayList<>();
        getLLCombo(digits, "", ans, digits.length());
        return ans;
    }

    String[] codes = {" ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public void getLLCombo(String str, String asf, ArrayList<String> res, int n){
        if(asf.length() == n){
            res.add(asf);
            return;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        String codeforch = codes[ch - '0'];
        for(char cho : codeforch.toCharArray()){
            getLLCombo(ros, asf+cho, res, n);
        }
    }
}
