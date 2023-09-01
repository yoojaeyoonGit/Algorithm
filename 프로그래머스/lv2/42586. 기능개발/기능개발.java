import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            list.add((int)Math.ceil((double) (100 - progresses[i]) / speeds[i]));
        }
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        int sum = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                sum += 1;
            } else {
                list2.add(sum);
                sum = 1;
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