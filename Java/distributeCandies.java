class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int give = 1;
        int i = 0;
        while (candies > 0) {
            if (candies >= give) {
                ans[i] += give;
                candies -= give;
            } else {
                ans[i] += candies;
                candies = 0;
            }
            give++;
            i++;
            if (i == num_people) {
                i = 0;
            }
        }

        return ans;
    }
}