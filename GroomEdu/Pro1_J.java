package GroomEdu;

import java.util.Scanner;

public class Pro1_J {
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * 1부터 N까지의 자연수의 합을 계산하는 함수
     *
     * @param i
     * @return
     */
    public static int getRangeSumFromOne(int i) {
        int sum = 0;
        for (int k = 1; k <= i; k++) {
            sum += k;
        }
        return sum;
    }


    public static long getAnswer(int N) {
        int ssum = 0;

        for (int j = 1; j <= N; j++) {
            ssum += getRangeSumFromOne(j);
        }
        return ssum;
    }


    public static void main(String[] args) throws Exception {
        int n = scanner.nextInt();

        long answer = getAnswer(n);

        System.out.println(answer);
    }

}