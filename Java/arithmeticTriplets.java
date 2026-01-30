class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (set.contains(x + diff) && set.contains(x + 2 * diff)) {
                count++;
            }
        }
        return count;
    }
}