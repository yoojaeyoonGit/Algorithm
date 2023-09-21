import java.util.*;

class Solution {
    public static boolean solution(String s) {
            Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++ ) {
            if (s.charAt(0) == ')') {
                return false;
            }

            if (s.charAt(i) == '(') {
                stack.push('(');
            } else {
                if (stack.size() == 0) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        
        if (stack.size() != 0) {
            return false;
        }
        
        return true;
    }
}
        