package InflearnLecture.chap06SortingAndSearching;

public class pro4 {

    public int[] solution(int N, int M, int[] arr) {
        int[] cache = new int[M];

        //set으로 하면 안돼 그걸 물어보려고 한 게 아니야
        //삽입 정렬로 풀어야한다.
        for (int x : arr) {
            //hit냐 mis냐 따지기 위해
            int pos = -1;
            for (int i = 0; i < size; i++) {
                if (x == cache[i]) pos = i;
            }//hit일 경우 인덱스 값 저장후 거기서부터 처리
            if (pos == -1) {
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            } else {
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                    cache[0] = x;
                }
            }
            return cache;
        }
    }
}
