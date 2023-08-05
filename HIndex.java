class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int i = citations.length - 1;
        int h = 0;
        while (i >= 0) {
            if (citations[i] > h) {
                h++;
            }
            i--;
        }
        return h;
    }
}
