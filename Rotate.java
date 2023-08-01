class Solution {
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; //一定要取余，避免indexOfRange错误
        reverse(nums, 0, n-1); //先整体翻转
        reverse(nums, 0, k-1); //再翻转第 1 到 k 个数
        reverse(nums, k, n-1); //最后翻转第 k+1 到第 n 个数
    }
}
