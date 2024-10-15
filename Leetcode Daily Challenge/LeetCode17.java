class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if (digits == null || digits.length() == 0) {
            return res;
        }
        helper(arr, res, "", digits, 0);
        return res;
    }

    private void helper(String[] arr, List<String> result, String temp, String digits, int index) {
        if (index == digits.length()) {
            result.add(temp);
            return;
        }

        int d = digits.charAt(index) - '0';
        String letters = arr[d];

        for (char l : letters.toCharArray()) {
            temp += l;
            helper(arr, result, temp, digits, index + 1);
            temp = temp.substring(0, temp.length() - 1);
        }
    }
}
