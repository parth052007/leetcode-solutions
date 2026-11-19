
class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        String[] map = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
        };

        backtrack(0, digits, "", ans, map);

        return ans;
    }

    public void backtrack(int index, String digits,
                          String current, List<String> ans,
                          String[] map) {

        if (index == digits.length()) {
            ans.add(current);
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {

            backtrack(index + 1, digits,
                      current + letters.charAt(i),
                      ans, map);
        }
    }
}
