package BOJ.BaseDatastructure;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1037 {
    public static void main(String[]args)throws IOException {
        Scanner in = new Scanner(System.in);
// 이걸로 암기
        int T = in.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while(T-- > 0) {
            int N = in.nextInt();
            if(N > max) max = N;
            if(N < min) min = N;

        }
        System.out.println(max * min);
    }

    //이건 누구나 생각 가능
    public static void main2(String[]args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[]arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int max = arr[N-1];
        int min = arr[0];

        System.out.println(max*min);
    }
}