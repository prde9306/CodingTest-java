package Programmers.sorting;
import java.util.Arrays;

/**
 * 1 번 프로그래머스 정렬-K번째 수
 *
 *
 *
 * 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
 *
 * 예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
 *
 * array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
 * 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
 * 2에서 나온 배열의 3번째 숫자는 5입니다.
 * 배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한사항
 * array의 길이는 1 이상 100 이하입니다.
 * array의 각 원소는 1 이상 100 이하입니다.
 * commands의 길이는 1 이상 50 이하입니다.
 * commands의 각 원소는 길이가 3입니다.
 *
 * 입출력 예
 * array	commands	return
 * [1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
 * 입출력 예 설명
 * [1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.
 * [1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.
 * [1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다.
 */

public class k번째수 {

    //Sol1
    public static int[] solution(int[] array, int[][] commands) {

        //배열 선언하면서 크기 지정해줘야 (처음으로)
        int[] answer = new int[commands.length];
        int index = 0;

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];

            int[] tmp = new int[end - start + 1];

            int a = 0;
            for (int j = start - 1; j < end; j++)
                tmp[a++] = array[j];

            Arrays.sort(tmp);
            //배열에 어떻게 집어넣는지 잘봐
            answer[index++] = tmp[k - 1];
        }
        return answer;
    }


    //sol2
    /**
     * 암기
     * copyOfRange(배열, 시작인덱스, 종료인덱스) 메소드는 시작인덱스는 포함하고, 종료인덱스는 포함하지 않는다.
     * 예를 들어, [1,2,3,4,5,6]의 배열이 있다면 copyOfRange(배열,2,5) 의 경우 [3, 4, 5]만 해당된다.
     */

    public int[] solution1(int[] array1, int[][] commands1) {
        int[] answer = new int[commands1.length];
        for (int i = 0; i < commands1.length; i++) {
            int[] temp = Arrays.copyOfRange(array1, commands1[i][0] - 1, commands1[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands1[i][2] - 1];
        }
        return answer;
    }

    //sol3(sort메소드를 직접 구함)

    public int[] solution2(int[] array2, int[][] commands2) {
        int n = 0;
        int[] answer1 = new int[commands2.length];

        while (n < commands2.length) {
            int m = commands2[n][1] - commands2[n][0] + 1;

            if (m == 1) {
                answer1[n] = array2[commands2[n++][0] - 1];
                continue;
            }

            int[] a = new int[m];
            int j = 0;
            for (int i = commands2[n][0] - 1; i < commands2[n][1]; i++)
                a[j++] = array2[i];

            sort(a, 0, m - 1);

            answer1[n] = a[commands2[n++][2] - 1];
        }

        return answer1;
    }

    void sort(int[] a, int left, int right) {
        int pl = left;
        int pr = right;
        int x = a[(pl + pr) / 2];

        do {
            while (a[pl] < x) pl++;
            while (a[pr] > x) pr--;
            if (pl <= pr) {
                int temp = a[pl];
                a[pl] = a[pr];
                a[pr] = temp;
                pl++;
                pr--;
            }
        } while (pl <= pr);

        if (left < pr) sort(a, left, pr);
        if (right > pl) sort(a, pl, right);
    }

}


