package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    //출력초과
    public static void main(String[]args) throws IOException {
    
        String catCdStr = "C008000";

         catCdStr = catCdOfFinalBigCategory.split("C")[1].split("000")[0];

         System.out.println(catCdStr);

    }
}