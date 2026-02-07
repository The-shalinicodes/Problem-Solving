class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] res = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    res[k++] = nums1[i];
                    nums2[j] = -1;
                    break;
                }
            }
        }
        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = res[i];
        }
        return answer;
    }
}