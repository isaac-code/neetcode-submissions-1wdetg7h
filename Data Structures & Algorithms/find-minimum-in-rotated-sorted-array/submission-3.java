class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int left = 0;
        int right = nums.length - 1;
        int lastElementInArray = nums[nums.length - 1];
        int boundaryIndex = -1;

        while (left <= right) {
            int midpoint = left + (right - left) / 2;
            if (nums[midpoint] <= lastElementInArray) {
                boundaryIndex = midpoint;
                right = midpoint - 1;
            } else {
                left = midpoint + 1;
            }
        }

        return nums[boundaryIndex];
    }
}
