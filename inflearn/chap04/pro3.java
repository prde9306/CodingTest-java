package inflearn.chap04;

import java.util.Scanner;
import java.io.IOException;

class Main{

    class Main{

        //이거 안된다.
        public int[] solution(int N, int M, int[]arr){
            int sol[] = new int[N/2];
            for(int j=0; j<N/2; j++){
                int answer =1;
                for(int i=j; i<M+j; i++){
                    if(arr[j]!=arr[i+1]) answer++;
                    sol[j]=answer;
                }
            }
            return sol;



        }

        public ArrayList<Integer> solution(int N, int M, int[]arr){
            ArrayList<Integer> answer = new ArrayList<>();
            HashMap<Integer, Integer> HM = new HashMap<>();
            //미리 세팅
            for(int i=0; i<k-1; i++){
                HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
            }
            int lt =0;
            for(int rt=k-1; rt<N; rt++){
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