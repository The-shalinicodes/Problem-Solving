class Solution {
    public int maxCoins(int[] piles) {
        int a = piles.length;
        int b = a / 3;
        int count = 0;
        Arrays.sort(piles);
        int c = a - 2;
        while (b != 0) {
            count += piles[c];
            c=c-2;
            b--;
        }
        return count;
    }
}