class Solution {
    public int binaryGap(int n) {
        int lastPos = -1;   // stores previous 1 position
        int maxGap = 0;
        int pos = 0;

        while (n > 0) {
            if ((n & 1) == 1) {   // check if current bit is 1
                if (lastPos != -1) {
                    maxGap = Math.max(maxGap, pos - lastPos);
                }
                lastPos = pos;
            }
            pos++;
            n >>= 1;   // shift right
        }

        return maxGap;
    }
}