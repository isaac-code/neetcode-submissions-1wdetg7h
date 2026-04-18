class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (s == null || n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int maxUnique = 0;
        int left = 0;
        int right = 0;
        Set<Character> window = new HashSet<>();

        while (right < n) {
            char c = s.charAt(right);
            if (!window.contains(c)) {
                window.add(c);
                maxUnique = Math.max(maxUnique, right - left + 1);
                right++;
            } else {
                window.remove(s.charAt(left));
                left++;
            }
        }
        return maxUnique;
    }
}
