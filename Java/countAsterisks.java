class Solution {
    public int countAsterisks(String s) {
        int count=0;
        boolean b=false;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='|'){
                b=!b;

            }
            else if(c=='*' && !b){
                count++;
            }
        }
        return count;
    }
}