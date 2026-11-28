
class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();

        String[] parts = path.split("/");

        for (String s : parts) {

            if (s.equals("") || s.equals(".")) {
                continue;
            }

            else if (s.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            }

            else {
                st.push(s);
            }
        }

        StringBuilder result = new StringBuilder();

        for (String s : st) {
            result.append("/").append(s);
        }

        if (result.length() == 0) {
            return "/";
        }

        return result.toString();
    }
}
