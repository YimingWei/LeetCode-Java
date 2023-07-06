class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            // 若找到val，则和后面的数交换，因为后面的数不需要考虑
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
