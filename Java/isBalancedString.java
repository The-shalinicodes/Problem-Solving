class Solution {
    public boolean isBalanced(String num) {
        int evenSum =0;
        int oddSum =0;
        for(int i=0;i<num.length();i++){
           if(i%2==0){
            evenSum += num.charAt(i)-'0';
           }else{
            oddSum += num.charAt(i)-'0';
           }
        }
        return oddSum == evenSum;
    }
}