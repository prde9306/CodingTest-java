package BOJ.SearchSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1026 {

        //sol2
        public static void main(String[] args) throws Exception {
            // TODO Auto-generated method stub

            Scanner sc = new Scanner(System.in);
            // 전채 갯수? default로 10?
            int n = sc.nextInt();

            int[] A = new int[n];
            int[] B = new int[n];

            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                B[i] = sc.nextInt();

            }
            Arrays.sort(A);
            Arrays.sort(B);
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += A[i] * B[n - 1 - i];
            }
            System.out.println(sum);

        }

    }


