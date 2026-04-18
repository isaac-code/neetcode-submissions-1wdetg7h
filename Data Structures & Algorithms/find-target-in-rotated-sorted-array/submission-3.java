class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int midpoint = left + (right - left) / 2;
            if (nums[midpoint] == target) return midpoint;
            if (nums[left] == target) return left;
            if (nums[right] == target) return right;
            
            if (nums[left] <= nums[midpoint]) {
                if (nums[left] < target && target < nums[midpoint]) {
                    right = midpoint - 1;
                } else {
                    left = midpoint + 1;
                }
            } else {
                if (nums[right] > target && target > nums[midpoint]) {
                    left = midpoint + 1;
                } else {
                    right = midpoint - 1;
                }
            }
        }
        return -1;
    }
}
