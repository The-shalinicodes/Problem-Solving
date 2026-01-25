class Solution {
    public int minimumPrefixLength(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                res = i + 1;
            }
        }
        return res;
    }
}