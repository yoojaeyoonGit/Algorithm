import java.util.Arrays;

public class Solution {
    public String solution(int[] numbers) {
        String[] array = new String[numbers.length];

        int i = 0;
        for (int number : numbers) {
            array[i] =  String.valueOf(number);
            i ++;
        }

        Arrays.sort(array, (a, b) -> (b + a).compareTo(a + b));
        
        if (array[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        for (String s : array) {
            sb.append(s);
        }
        return sb.toString();
    }
}