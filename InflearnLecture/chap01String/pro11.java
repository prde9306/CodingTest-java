package InflearnLecture.chap01String;

import java.util.Scanner;
import java.io.IOException;

class Main{
/**
 * 풀이 방식 완전 똑같이 생각했는데 왜 charAt.. 안쓰냐
 */
    public String solution(String str){
        String answer = "";
        //뒤에 빈 문자 하나 추가
        str = str+" ";
        int cnt =1;
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i)==str.charAt(i+1))cnt++;
            else{
                answer +=str.charAt(i);
                if(cnt>1) answer+=String.valueOf(cnt);
                cnt=1;
            }
        }
        return answer;
    }
    public static void main (String[]args)throws IOException{
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(T.solution(str));

    }
}