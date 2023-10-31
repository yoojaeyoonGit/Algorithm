class Solution {
    static boolean[] check;
    static int count = 0;
    
        public static int solution(int k, int[][] dungeons) {
        check = new boolean[dungeons.length];
        recursive(k, 0, dungeons);
        return count;
    }

    public static void recursive(int life, int depth, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (check[i] || dungeons[i][0] > life) {
                continue;
            }
            check[i] = true;
            recursive(life - dungeons[i][1], depth + 1, dungeons);
            check[i] = false;
        }
        count = Math.max(count, depth);
    }
}