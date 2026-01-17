public class Solution {
    public long removeZeros(long n) {
        if (n == 0) return 0L;
        long res = 0L;
        long place = 1L;
        while (n > 0) {
            long d = n % 10;
            if (d != 0) {
                res += d * place;
                place *= 10;
            }
            n /= 10;
        }
        return res;
    }
}