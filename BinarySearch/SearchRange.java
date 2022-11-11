class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[] {left_bound(nums, target), right_bound(nums, target)};
    }

    int left_bound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target > nums[mid]) {
                // 搜索区间变为[mid+1, right]
                left = mid + 1;
            } else if (target < nums[mid]) {
                // 搜索区间变为[left, mid-1]
                right = mid - 1;
            } else if (target == nums[mid]) {
                // 收缩右边界
                right = mid - 1;
            }
        }

        if (left >= nums.length || nums[left] != target) {
            return -1;
        } else {
            return left;
        }
    }

    int right_bound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else if ( target == nums[mid]) {
                // 收缩左边界
                left = mid + 1;
            }
        }

        if (right < 0 || nums[right] != target) {
            return -1;
        } else {
            return right;
        }
    }
}
