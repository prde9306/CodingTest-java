package inflearn.chap02Array;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 숫자 뒤집기 계속 틀려
 */
public class Main{

          public boolean isPrime(int num){
              if(num==1) return false;
              for(int i=2; i<num; i++){
                 // 2 부터 자기자신 전까지
                  if(num%i==0) return false;
              }
              return true;
          }

          public ArrayList<Integer> solution(int N, int[]arr){
              ArrayList<Integer> answer = new ArrayList<>();
              for(int i=0; i<N; i++){
                  int tmp = arr[i];
                  //숫자 뒤집기 -전형적인 것 암기
                  int res =0;
                  while(tmp>0){
                      int t = tmp%10;
                      res= res*10+t;
                      tmp = tmp/10;
                  }
                  if(isPrime(res)) answer.add(res);
              }

              return answer;
          }
          public static void main(String[]args)throws IOException {

              Main T = new Main();
              Scanner sc = new Scanner(System.in);
              int N = sc.nextInt();
              int []arr = new int[N];

              for(int i=0; i<N; i++){
                  arr[i]= sc.nextInt();
              }
              for(int x:  T.solution(N, arr)){
                  System.out.print(x+" ");
              }

          }
      }

}
