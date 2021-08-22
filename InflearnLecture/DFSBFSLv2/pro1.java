package InflearnLecture.DFSBFSLv2;

import java.util.Scanner;

public class pro1 {

      //합이 같아야 하고, 서로 중복된 원소를 가지면 안된다.
      //YES or NO 찍어라
          static String answer ="NO";
          static int n, total=0;
          boolean flag = false; // yes가 발견되면 그다음 제귀들 다 리턴시키게
          static int[]arr;

          public void DFS(int L, int sum){
                  if(flag == true) return;//flag가 true로 되면 다 리턴시켜라
                  if(sum>total/2) return;
                  if(L==n){
                      if((total-sum)==sum){
                          answer="YES";
                          flag =true;
                      }
                  else{
                      DFS(L+1, sum+arr[L]);
                      DFS(L+1, sum);
                  }
          }
          }

          public static void main(String[]args){
              pro1 T = new pro1();
              Scanner kb = new Scanner(System.in);
              n = kb.nextInt();
              arr = new int[n];

              for(int i=0; i<n; i++){
                  arr[i]=kb.nextInt();
                  total +=arr[i];
              }
              T.DFS(0,0);
              System.out.println(answer);
          }
      }


