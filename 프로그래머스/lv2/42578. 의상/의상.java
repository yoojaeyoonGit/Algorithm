import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < clothes.length; i ++ ) {
            hm.put(clothes[i][1], 0);
        }

        for (int i = 0; i < clothes.length; i ++ ) {
            hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 0) + 1);
        }


        int answer = 1;

        Iterator<Integer> iterator = hm.values().iterator();
        while (iterator.hasNext()) {
            answer *= iterator.next() + 1;
        }


        return answer - 1;
    }
}