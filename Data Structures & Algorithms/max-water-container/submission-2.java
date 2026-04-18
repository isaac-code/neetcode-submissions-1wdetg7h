class Solution {
    public int maxArea(int[] heights) {
        int maxSum = 0;
        int left = 0;
        int right = heights.length - 1;
        while (left < right) {
            int area = Math.min(heights[left], heights[right]) * (right - left);
            maxSum = Math.max(area, maxSum);
            if (heights[left] == heights[right]) {
                left++;
                right--;
            } else if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxSum;
    }
}
