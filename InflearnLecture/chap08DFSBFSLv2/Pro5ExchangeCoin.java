package InflearnLecture.chap08DFSBFSLv2;

import java.io.IOException;
import java.util.*;
import java.util.Scanner;

class Main {
    /**
     * BFS최단거리 구하는 방식으로 구하면 안되나?
     * 송아지 찾기 문제처럼 못 푼다. check배열 만들 수 있는 단서가 없어
     * DP랑도 연결해서 공부
     */
    static int n, m, answer = Integer.MAX_VALUE;

    //여기서 L이 동전 갯수
    public void DFS(int L, int sum, Integer[] arr) {
        if (sum > m) return;
        if (L >= answer) return;
        if (sum == m) {
            answer = Math.min(answer, L);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(L + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        //객체형으로 해야 Collections.reverseOrder()먹힌다.
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        //내림차순으로 해서 빨리 답 나오게
        Arrays.sort(arr, Collections.reverseOrder());
        m = sc.nextInt();
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }

    /**
     * 추가로 하는 중(BFS로는 못 풀듯 갔다온 곳 채크할 수가 없어)
     */


    class Main {

        static int[] type;
        static int N;
        static int change;

        int answer = 1;
        int min = Integer.MAX_VALUE;
        int[] ch;
        Queue<Integer> qu = new LinkedList<>();

        public void BFS() {
            for (int i = 0; i < N; i++) {
                qu.offer(type[i]);
            }
            while (!qu.isEmpty()) {
                int len = qu.size();
                for (int i = 0; i < len; i++) {
                    int x = qu.poll();
                    for (int j = 0; j < N; j++) {
                        qu.offer(x + type[j]);
                    }
                }
                answer++;
            }
        }

        public static void main(String[] args) throws IOException {
            Main T = new Main();
            Scanner sc = new Scanner(System.in);

            N = sc.nextInt();
            type = new int[N];

            for (int i = 0; i < N; i++) {
                type[i] = sc.nextInt();
            }

            change = sc.nextInt();

            T.BFS();
        }
    }

}