import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int num = 0;

        for (int priority : priorities) {
            pq.add(priority);
        }

        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if(priorities[i] == pq.peek()) {
                    num ++;
                    pq.poll();
                    if (i == location) {
                        return num;
                    }
                }
            }
        }
        return num;
    }
}