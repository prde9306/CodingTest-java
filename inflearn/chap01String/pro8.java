package inflearn.chap01String;

import java.io.IOException;
import java.util.Scanner;

class Main{

    public String solution (String s){
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");// 대문자 A~Z까지 외에 다 제거해라
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer ="YES";

        return answer;

    }

    public static void main(String[]args)throws IOException{
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.printf(T.solution(str));



    }
}