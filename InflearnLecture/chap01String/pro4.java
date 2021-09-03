package InflearnLecture.chap01String;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//sol1 StringBuilder 이용하기

    class Main{

        public ArrayList<String> solution(int N, String[] str){

            ArrayList<String> answer = new ArrayList<>();
            for(String x : str){
                //stringbuilder도 하나의 string 객체이다.
                String tmp = new StringBuilder(x).reverse().toString();
                answer.add(tmp);
            }
            return answer;
        }

        public static void main(String[] args) throws IOException{

            Main T = new Main();
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            String str = sc.nextLine();
            String [] arr = new String[N];

            for(int i=0; i<N; i++){
                arr[i]=sc.next();
            }
            for(String x : T.solution(N, arr)){
                System.out.println(x);
            }
        }
    }

    //sol2 직접 뒤집기
    class Main{

        public ArrayList<String> solution(int N, String[] str){

            ArrayList<String> answer = new ArrayList<>();

            for(String x : str){
                char[] s=x.toCharArray();
                int lt =0;
                int rt=x.length()-1;

                while(lt<rt){
                    char tmp =s[lt];
                    s[lt]=s[rt];
                    s[rt]=tmp;
                    lt++;
                    rt--;
                }
                String tmp = String.valueOf(s);
                answer.add(tmp);
            }
            return answer;
        }

        public static void main(String[] args) throws IOException{

            Main T = new Main();
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            String str = sc.nextLine();
            String [] arr = new String[N];

            for(int i=0; i<N; i++){
                arr[i]=sc.next();
            }
            for(String x : T.solution(N, arr)){
                System.out.println(x);
            }
        }
    }

