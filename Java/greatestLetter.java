class Solution {
    public String greatestLetter(String s) {
        boolean []lower =new boolean[26];
        boolean[]upper=new boolean[26];
        for(char c:s.toCharArray()){
            if(Character.isLowerCase(c)){
                lower[c-'a']=true;
            }else if(Character.isUpperCase(c)){
                upper[c-'A']=true;
            }
        }
        for(int i=25;i>=0;i--){
            if(lower[i]&& upper[i]){
                return String.valueOf((char)('A'+i));
            }
        }
        return "";
    }
}