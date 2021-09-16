package InflearnLecture.chap01String;

import java.util.Scanner;
import java.io.IOException;

class Main{

    public String solution(int N, String str){
        String answer ="";
        for(int i=0; i<N; i++){
            //replace 사용방식 잘봐봐
            String tmp = str.substring(0,7).replace('#', '1').replace('*','0');
            //이진수로 된걸바꾼다
            int num = Integer.parseInt(tmp,2);
            answer +=(char)num;
            //substring 인자에 따른 차이
            str =str.substring(7);
        }
        return answer;
    }
    public static void main (String[]args)throws IOException{
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String str = sc.next();
        System.out.print(T.solution(N, str));

    }
}