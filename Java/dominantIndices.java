class Solution {
    public int dominantIndices(int[] nums) {
        int res = 0;
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {

            int count = i;
            int num = nums[n - 1 - i];
            if (num * count > sum) {
                res++;

            }
            sum += num;
        }
        return res;
    }
}