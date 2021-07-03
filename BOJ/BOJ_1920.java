package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_1920 {
    //BufferedReader와 Scanner차이 명확히 알기

    public static void main(String[] args) {

        int num1 = 0 ;
        int num2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("첫번쨰 정수 : ");
        num1 = sc.nextInt();
        System.out.print("두번쨰 정수 : ");
        num2 = sc.nextInt();

        System.out.println("첫번쨰 정수 : "+num1);
        System.out.println("두번쨰 정수 : "+num2);
        System.out.print("두 수의 합   : ");
        System.out.println(num1+num2);
    }

    public static void main2(String[] args){
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();

        int[] array1 = new int[l1];
        int[] array2 = new int[l2];

        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array2.length; j++){
                if(array1[i]==array2[j]){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }
        }

    }
    //sol1
    public static void main3(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // int n = Integer.parseInt(br.readLine());

        String[] a = br.readLine().split(" ");
        HashSet<String> hs = new HashSet<>(Arrays.asList(a));

        int m = Integer.parseInt(br.readLine());
        String[] arrM = br.readLine().split(" ");
        for (int i=0; i<m; i++) {

            if (hs.contains(arrM[i])) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    //sol2
    //bSearch많이 사용됨
    public static boolean bSearch(int[] arr, int target) {
        int min = 0;
        int max = arr.length - 1;

        while(min <= max) {
            int mid = (min + max) / 2;

            if(arr[mid] == target) {
                return true;
            }else if(arr[mid] > target) {
                max = mid - 1;
            }else if(arr[mid] < target) {
                min = mid + 1;
            }
        }
        return false;
    }

    public static void main4(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());
            if(bSearch(arr, target)) {
                sb.append("1\n");
            }else {
                sb.append("0\n");
            }
        }
        System.out.println(sb.toString());
    }
}
