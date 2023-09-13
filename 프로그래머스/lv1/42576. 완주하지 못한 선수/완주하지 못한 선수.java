import java.util.*;        

class Solution {
    public String solution(String[] participant, String[] completion) {
       HashMap<String, Integer> hm = new HashMap<>();
        String answer = "";

        for (String player : participant) {
            hm.put( player, hm.getOrDefault(player, 0) + 1);
        }

        for (String player : completion) {
            hm.put(player, hm.get(player) - 1);
        }

        for (String s : hm.keySet()) {
            if (hm.get(s) == 1) {
                answer = s;
            }
        }
        return answer;
    }
}