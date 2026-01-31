class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> missingNum = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return missingNum;
        }
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        for (int i = min; i <= max; i++) {
            boolean found = false;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missingNum.add(i);
            }
        }
        return missingNum;
    }
}