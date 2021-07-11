package Test;

import java.util.Scanner;

public class fibonacci1 {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();


    public int fibonacci(int n) {
        if (n == 0) {
            System.out.println("0");
            return 0;
        } else if (n == 1) {
            System.out.println("1");
            return 1;
        } else {
            return fibonacci(n‐1) + fibonacci(n‐2);
        }
    }

}
