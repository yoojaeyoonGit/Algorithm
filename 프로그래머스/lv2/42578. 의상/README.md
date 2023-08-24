# [level 2] 의상 - 42578 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42578?language=java) 

코드 수정

```
// 수정전 코드
import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> hash = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            if (hash.containsKey(clothes[i][1])) {
                hash.put(clothes[i][1], hash.get(clothes[i][1]) + 1);
            }
            else {
                hash.put(clothes[i][1], 1);
            }
        }
        int answer = 1;

        Iterator<Integer> valueIterator = hash.values().iterator();
        while (valueIterator.hasNext()) {
            answer *= valueIterator.next() + 1;
        }
        return answer - 1;
    }
}
```


수정전 코드는 hash value에 1을 증가시켜 줄 때 키 값을 비교하여 있다면 1 증가 시키고 아니라면 그냥 hash에 put하게 하였는데
getOrDefault를 사용하면 if else 문을 거치지 않고 value 값을 증가 시킬 수 있었다.

```
// 수정 후 코드
import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> hash = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            hash.put(clothes[i][1], hash.getOrDefault(clothes[i][1], 0) + 1);
        }
        int answer = 1;

        Iterator<Integer> valueIterator = hash.values().iterator();
        while (valueIterator.hasNext()) {
            answer *= valueIterator.next() + 1;
        }
        return answer - 1;
    }
}
```


