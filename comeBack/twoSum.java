class Solution {
    public int[] twoSum(int[] nums, int target) {
        // The "0ms Hack" - Searching by distance offset
        for (int offset = 1; offset < nums.length; offset++) {
            for (int i = offset; i < nums.length; i++) {
                if (nums[i] + nums[i - offset] == target) {
                    return new int[] { i - offset, i };
                }
            }
        }
        return new int[0];
    }
}