class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        
        List<Boolean> answer = new ArrayList<>();

        int value = 0;

        for (int i = 0; i < nums.length; i++) {
            
            value = (value * 2 + nums[i]) % 5;
            answer.add(value == 0);
        }
        return answer;
    }
}