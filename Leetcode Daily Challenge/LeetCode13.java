class Solution {
    public int romanToInt(String s) 
    {
    	Map<Character, Integer> val = new HashMap<>();
        val.put('I', 1);
        val.put('V', 5);
        val.put('X', 10);
        val.put('L', 50);
        val.put('C', 100);
        val.put('D', 500);
        val.put('M', 1000);

        int res=0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = val.get(s.charAt(i));
            if (i < s.length() - 1 && currValue < val.get(s.charAt(i + 1))) {
                res -= currValue;
            } else {
                res += currValue;
            }
        }

        return res;
    }
}
