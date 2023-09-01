# [level 2] 기능개발 - 42586 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42586) 

정답 코드가 이거긴 한디
```
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
```


내가 원래 풀던건 
```
    public static int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            int prg = (100 - progresses[i])/speeds[i];
            if (prg * speeds[i] + progresses[i] < 100) {
                prg += 1;
            }
            list.add(prg);
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
```

이렇게 했는데 셈플 문제만 맞고 다른건 틀리더라 아마 비교하는 수를 딱 지정안해줬기 때문에 그럴 것인디. 
queue 사용 방법도 알고 좋은 것 같다. 어쩄든 풀이 방법은 알았기 떄무넹 
