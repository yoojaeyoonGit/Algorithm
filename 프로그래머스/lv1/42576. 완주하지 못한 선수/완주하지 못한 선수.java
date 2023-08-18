import java.util.*;        

class Solution {
    public String solution(String[] participant, String[] completion) {
       HashMap<String, Integer> hashMap = new HashMap<>();
        String answer = "";

        for (String part : participant){
            hashMap.put(part, hashMap.getOrDefault(part, 0) + 1);
        }

        for (String comp : completion) {
            hashMap.put(comp, hashMap.get(comp) -1);
        }

        for (String keySet : hashMap.keySet()) {
            if (hashMap.get(keySet) == 1) {
                answer = keySet;
            }

        }
        return answer;
    }
}