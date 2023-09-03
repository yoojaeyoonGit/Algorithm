import java.util.*;

class Solution {
    public static boolean solution(String s) {
    Stack<Character> stack = new Stack<>();
        
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '(') {
            stack.push('(');
        } else {
            if (stack.empty()) {
                return false;
            }
        stack.pop();
            }
        }
        boolean answer = stack.empty();
        return answer;
    }
}
        