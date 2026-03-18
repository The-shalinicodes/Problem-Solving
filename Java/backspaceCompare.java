class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c1 = s.charAt(i);
            if (c1 == '#') {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            } else {
                stack1.push(c1);
            }
        }
        int m = t.length();
        for (int i = 0; i < m; i++) {
            char c2 = t.charAt(i);
            if (c2 == '#') {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            } else {
                stack2.push(c2);
            }
        }
        if (stack1.equals(stack2)) {
            return true;
        }
        return false;
    }
}