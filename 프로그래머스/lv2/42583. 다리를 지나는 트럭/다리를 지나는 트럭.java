import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> q = new LinkedList<>();
        int time = 0;
        int sum = 0;

        for (int i = 0; i < truck_weights.length; i ++) {
            int truck_weight = truck_weights[i];
            while (true) {
                if (q.isEmpty()) {
                    q.add(truck_weight);
                    sum += truck_weight;
                    time ++;
                    break;
                } else if (bridge_length == q.size()) {
                    int depart_truck = q.poll();
                    sum -= depart_truck;
                } else {
                    if (sum + truck_weight > weight) {
                        q.add(0);
                        time ++;
                    } else {
                        q.add(truck_weight);
                        time ++;
                        sum += truck_weight;
                        break;
                    }
                }
            }
        }
        return time + bridge_length;
    }
}