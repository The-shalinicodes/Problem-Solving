class Solution {
    public int numSub(String s) {
        int n = s.length();
        int MOD = (int) 1e9 + 7, count = 0, curr = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '1') {
                curr += 1;
                count = (count + curr) % MOD;
            } else {
                curr = 0;
            }
        }
        return count;
    }
}