class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;

            }
        }
        int maxValue = nums[maxIndex];
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && maxValue < 2 * nums[i]) {
                return -1;
            }
        }
        return maxIndex;
    }
}