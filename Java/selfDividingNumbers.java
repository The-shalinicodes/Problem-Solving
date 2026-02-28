class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            int num = i;
            boolean isValid = true;
            while (num > 0) {
                int digit = num % 10;
                if (digit == 0 || i % digit != 0) {
                    isValid = false;
                    break;
                }
                num = num / 10;
            }
            if (isValid)
                res.add(i);
        }
        return res;
    }
}