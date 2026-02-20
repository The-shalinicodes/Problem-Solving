class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        Set<Integer> set = new HashSet<>();
        while (i < j) {
            set.add(nums[i] + nums[j]);
            i++;
            j--;
        }
        return set.size();
    }
}