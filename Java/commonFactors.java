class Solution {
    public int commonFactors(int a, int b) {
        int count = 0;
        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        return count;
    }
}