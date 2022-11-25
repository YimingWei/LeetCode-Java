class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        // 注意是序列，子序列在父序列中要保持原有的相对顺序
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
