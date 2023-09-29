import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int highest = 0;
        int longest_width = 0;
        int answer = 0;

        for (int[] size : sizes) {
            if (size[1] > size[0]) {
                int bigNum = size[0];
                size[0] = size[1];
                size[1] = bigNum;
            }

            if (size[0] > highest) {
                highest = size[0];
            }

            if (size[1] > longest_width) {
                longest_width = size[1];
            }
        }
        answer = highest * longest_width;

        return answer;
    }
}