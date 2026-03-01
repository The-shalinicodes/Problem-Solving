class Solution {
    public int longestSubarray(int[] nums, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();

       int prefixSum=0;
       int maxLength=0;

       for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];

            //case 1: If sum itself is k
            if(prefixSum==k){
                maxLength=i+1;
            }

            //case 2: If(prefixSum-k) seen before
            if(map.containsKey(prefixSum-k)){
                int length=i-map.get(prefixSum-k);
                maxLength=Math.max(length,maxLength);
            }

            //case 3: store prefixSum only if not present to get longestSubarray
            if(!map.containsKey(prefixSum)){
                map.put(prefixSum,i);
            }
       }
       return maxLength;
    }
}