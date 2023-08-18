import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {

        HashMap<Integer, String> map = new HashMap<>();
        int answer = 0;

        for (int num : nums) {
            map.put(num, "0");
        }
        int species = map.size();

        if (species <= nums.length/2){
            answer = species;
        } else {
            answer = nums.length/2;
        }

        return answer;
    }
}