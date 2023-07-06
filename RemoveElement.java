class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            if (nums[l] == val) {
                nums[l] = nums[r];
                r--;
            } else {
                l++;
            }
        }
        return l;
    }
}
