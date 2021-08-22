package InflearnLecture.chap03TwoPointer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main{
    public ArrayList<Integer> solution(int N, int M, int[]arr1, int[]arr2){
        int p1=0, p2=0;
        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while(p1<N && p2<M){
            if(arr1[p1]==arr2[p2]){answer.add(arr1[p1++]);
                p2++;}
            else if(arr1[p1]>arr2[p2])p2++;
            else p1++;
        }

        return answer;

    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int []arr1 = new int[N];
        for(int i=0; i<N; i++){
            arr1[i]= sc.nextInt();
        }

        int M = sc.nextInt();
        int[]arr2 = new int[M];
        for(int i=0; i<M; i++){
            arr2[i] = sc.nextInt();
        }
        for(int x :T.solution(N, M, arr1, arr2))
            System.out.print(x+" ");

    }
}
