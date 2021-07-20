package Programmers.exhaustivesearch;

public class Prime2 {
    class Solution {
        static boolean sosu[] = new boolean[10000000];
        static boolean visited[] = new boolean[8];
        static int ans[] = new int[8];
        static int answer = 0;

        public static int solution(String numbers) {
            isPossible();
            for (int i = 1; i <= numbers.length(); i++) {
                dfs(0, i, numbers);
            }
            return answer;
        }

        public static void dfs(int level, int end, String numbers) {
            if (level == end) {
                int num = 0;
                for (int i = 0; i < end; i++) {
                    num *= 10;
                    num += ans[i];
                }

                if (!sosu[num]) {
                    sosu[num] = true;    // 중복방지
                    answer++;
                }
                return;
            }

            for (int i = 0; i < numbers.length(); i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    ans[level] = numbers.charAt(i) - '0';
                    dfs(level + 1, end, numbers);
                    visited[i] = false;
                }
            }
        }

        public static void isPossible() {
            sosu[0] = true;
            sosu[1] = true;
            for (int i = 2; i <= (9999999 / 2); i++) {
                for (int j = i + i; j <= 9999999; j += i) {
                    sosu[j] = true;
                }
            }
        }
    }
}
