class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = nums[i];
            y[i] = nums[i + n];
        }

        int[] answer = new int[2 * n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            answer[index++] = x[i];
            answer[index++] = y[i];
        }
        return answer;
    }
}