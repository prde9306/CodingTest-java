package GroomEdu;

import java.io.IOException;
import java.util.Scanner;

public class Pro2_C {

    public static void main(String[]args)throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[]originalNum = new int[N];

        for(int i=0; i<N; i++){
            originalNum[i]= sc.nextInt();
        }

        int answer = getOriginalAlbumCount(originalNum, N);
    }
    public static int getOriginalAlbumCount(int[]originalNum, int N){
       int countNum =0;
        for(int i=0; i<N; i++) {
            if (i==0 ||originalNum[i-1]!=originalNum[i]){
                countNum++;

            }
        } return countNum;

    }
}
