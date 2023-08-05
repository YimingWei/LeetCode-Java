class Solution {
    public int lengthOfLastWord(String s) {
        String temp = s.trim();
        String[] arr = temp.split(" ");
        String last = arr[arr.length-1];
        return last.length();
    }
}
