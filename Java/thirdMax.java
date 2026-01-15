class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> arr = new HashSet<>();
        for(int i = 0 ; i <nums.length;i++)
        {
            arr.add(nums[i]);
        }
        Integer[] arr2=arr.toArray(new Integer[0]);
            Arrays.sort(arr2);
         if(arr2.length==3) return arr2[0];
         else if(arr2.length<3) return arr2[arr2.length-1];
         //else if (arr2.length >=4) return
         return arr2[arr2.length-3];
    } 

}