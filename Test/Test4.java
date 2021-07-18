package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Test4 {
    //출력초과
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String []arr1 = br.readLine().split(" ");
        HashSet<String> hs = new HashSet<>(Arrays.asList(arr1));

        int M = Integer.parseInt(br.readLine());
        String[]arr2 = br.readLine().split(" ");

        if(hs.cotains(arr2)){
            System
        }


    }
}