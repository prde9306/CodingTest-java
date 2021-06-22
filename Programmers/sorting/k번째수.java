package Programmers.sorting;

import java.util.Arrays;

public class k번째수 {
    //k번째 수
        public static int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            int index = 0 ;

            for(int i = 0 ; i < commands.length ; i++)
            {
                int start = commands[i][0];
                int end = commands[i][1];
                int k = commands[i][2];

                int[] tmp = new int[end - start + 1];

                int a = 0;
                for(int j = start - 1 ; j < end ; j++)
                    tmp[a++] = array[j];

                Arrays.sort(tmp);
                answer[index++] = tmp[k-1];
            }
            return answer;
        }


    //sol2
    //copyOfRange(배열, 시작인덱스, 종료인덱스) 메소드는 시작인덱스는 포함하고, 종료인덱스는 포함하지 않는다.
    //
    //예를 들어, [1,2,3,4,5,6]의 배열이 있다면 copyOfRange(배열,2,5) 의 경우 [3, 4, 5]만 해당된다.
    public int[] solution1(int[] array1, int[][] commands1) {
        int[] answer = new int[commands1.length];
        for(int i =0; i<commands1.length; i++) {
            int[] temp = Arrays.copyOfRange(array1, commands1[i][0]-1,commands[i][1]);
            Arrays.sort(temp);
            answer[i]=temp[commands1[i][2]-1];
        }
        return answer;
    }

    //sol3
    public int[] solution2(int[] array2, int[][] commands2) {
        int n = 0;
        int[] ret = new int[commands2.length];

        while(n < commands2.length){
            int m = commands2[n][1] - commands2[n][0] + 1;

            if(m == 1){
                ret[n] = array2[commands2[n++][0]-1];
                continue;
            }

            int[] a = new int[m];
            int j = 0;
            for(int i = commands2[n][0]-1; i < commands2[n][1]; i++)
                a[j++] = array2[i];

            sort(a, 0, m-1);

            ret[n] = a[commands2[n++][2]-1];
        }

        return ret;
    }

    void sort(int[] a, int left, int right){
        int pl = left;
        int pr = right;
        int x = a[(pl+pr)/2];

        do{
            while(a[pl] < x) pl++;
            while(a[pr] > x) pr--;
            if(pl <= pr){
                int temp = a[pl];
                a[pl] = a[pr];
                a[pr] = temp;
                pl++;
                pr--;
            }
        }while(pl <= pr);

        if(left < pr) sort(a, left, pr);
        if(right > pl) sort(a, pl, right);
    }

}


