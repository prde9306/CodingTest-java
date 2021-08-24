package InflearnLecture.chap04HashMapTreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.IOException;

class Main{

        public ArrayList<Integer> solution(int N, int M, int[]arr){
            ArrayList<Integer> answer = new ArrayList<>();
            HashMap<Integer, Integer> HM = new HashMap<>();
            //미리 세팅
            for(int i=0; i<M-1; i++){
                HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
            }

            int lt =0;
            for(int rt=M-1; rt<N; rt++){
                HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
                answer.add(HM.size());
                HM.put(arr[lt], HM.get(arr[lt])-1);
                if(HM.get(arr[lt])==0)HM.remove(arr[lt]);
                lt++;
            }

            return answer;

        }
        public static void main(String[]args)throws IOException{
            Main T = new Main();
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int M = sc.nextInt();
            int []arr = new int [N];
            for(int i=0; i<N; i++){
                arr[i]= sc.nextInt();
            }
            for(int x: T.solution(N, M, arr)){
                System.out.print(x+" ");
            }

        }

    }