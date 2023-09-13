import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {

                HashMap<Integer, Integer> hm = new HashMap<>();
        int possible = nums.length/2;

        for (int i = 0; i < nums.length; i ++) {
            hm.put(nums[i], i);
        }

        if (hm.size() <= possible) {
            return hm.size();
        } else {
            return possible;
        }
    }
}