import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int sco : scoville) {
            pq.add(sco);
        }

        int answer = 0;
        for (int i = 0; i < pq.size(); i++) {
            while (pq.peek() < K) {
                if (pq.size() == 1) {
                    return -1;
                } else {
                    pq.add(pq.poll() + (pq.poll() * 2));
                    answer += 1;
                }
            }
        }
        return answer;
    }
}