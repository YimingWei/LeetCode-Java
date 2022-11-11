class Solution {
    public int search (int[] nums, int target) {
        // 注意题目条件是“nums 是一个非递减数组”，也就是说只要得到左右边界的index，就可以求出target的重复次数
        int leftIndex = left_bound(nums, target);
        int rightIndex = right_bound(nums, target);
        if (leftIndex == -1 || rightIndex == -1) {
            return 0;
        } else {
            return rightIndex - leftIndex + 1;
        }
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
