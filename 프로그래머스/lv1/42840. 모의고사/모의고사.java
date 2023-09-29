import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] man1 = {1, 2, 3, 4, 5};
        int[] man2 = {2, 1, 2, 3, 2, 4, 2, 5,};
        int[] man3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] student = new int[3];
        ArrayList<Integer> arrayList = new ArrayList();

        for (int i = 0;  i < answers.length; i ++) {
            
            if (answers[i] == man1[i%5]) {
                student[0] += 1;
            }

            if (answers[i] == man2[i%8]) {
                student[1] += 1;
            }

            if (answers[i] == man3[i%10]) {
                student[2] += 1;
            }
        }

        int max = Math.max(student[2],  Math.max(student[0], student[1]));

        for (int i = 0; i < student.length; i ++) {
            if (max == student[i]) {
                arrayList.add(i + 1);
            }
        }

        int[] array = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i ++) {
            array[i] = arrayList.get(i);
        }
        
        return array;
    }
}