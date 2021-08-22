package InflearnLecture.chap01String;

import java.util.Scanner;

class Main{

    public String solution(String str){
        String answer ="";
        for(int i=0; i<str.length(); i++){

            //해당 문자가 나온 첫번째 인덱스 번호랑 실제 위치가 같을 경우만 넣고 그외는 중복된 것
            if(str.indexOf(str.charAt(i))==i) answer += str.charAt(i);
        }
        return answer;
    }

    public static void main (String[]args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}