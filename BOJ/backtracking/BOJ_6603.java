package BOJ.backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_6603 {
    static int N;
    static int[] arr;
    static boolean[]result;

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        while (true){
            N=sc.nextInt();

            if(N==0){
                break;
            }
            arr = new int[N];
            result = new boolean[N];
            for(int i = 0; i<N; i++){
                arr[i] = sc.nextInt();
            }
            DFS(0,0);
            System.out.println();
        }
    }

    private static void DFS(int start, int depth) {
        if(depth ==6){
            for(int i=0; i<N; i++){
                if(result[i]){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
        for(int i=start; i<N; i++){
            result[i]=true;
            DFS(i+1, depth+1);
            result[i]=false;
        }
    }

}
