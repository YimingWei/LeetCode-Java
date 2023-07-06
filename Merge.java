class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = m - 1;
        int r = n - 1;
        int s = m + n - 1;
        // 从后往前遍历
        while (l >= 0 && r >= 0) {
            if (nums1[l] >= nums2[r]) {
                nums1[s] = nums1[l];
                l--;
            } else {
                nums1[s] = nums2[r];
                r--;
            }
            s--;
        }
        // 如果nums1已遍历完而nums2还有数，则将剩余数复制到nums1；若nums1还有数则不需要动
        if (l < 0) {
            while (r >= 0) {
                nums1[s] = nums2[r];
                r--;
                s--;
            }
        }
    }
}
