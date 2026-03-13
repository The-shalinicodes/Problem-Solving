class Solution {
    public String trimTrailingVowels(String s) {

        StringBuilder sb = new StringBuilder(s);
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                sb.deleteCharAt(i);
            } else {
                return sb.toString();
            }
        }
        return sb.toString();
    }
}