import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list2 = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int prg = (100 - progresses[i])/speeds[i];
            if (prg * speeds[i] + progresses[i] < 100) {
                prg += 1;
            }
            q.add(prg);
        }

        int x = q.poll();
        int sum = 1;

        while (!q.isEmpty()) {
            if (x >= q.peek()) {
                sum += 1;
                q.poll();
            } else {
                list2.add(sum);
                sum = 1;
                x = q.poll();
            }
        }
        list2.add(sum);

        int loop_num = list2.size();
        int[] answer = new int[loop_num];

        for (int i = 0; i < loop_num; i++) {
            answer[i] = list2.get(i);
        }

        return answer;
    }    
}