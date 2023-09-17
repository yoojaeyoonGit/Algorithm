import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < arr.length; i ++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            }
            if (stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        list.addAll(stack);

        return list;
    }
}