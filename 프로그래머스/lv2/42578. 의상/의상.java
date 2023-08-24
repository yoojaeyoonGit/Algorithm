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