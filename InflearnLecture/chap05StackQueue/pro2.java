package InflearnLecture.chap05StackQueue;

import java.util.Scanner;
import java.util.Stack;
import java.io.IOException;

class Main{
    //풀이 방식 완전히 똑같이 생각했는데 못 풀어냄
    //pop이 어떻게 작동하는지 똑바로 몰라서, 스택에 있는 값 꺼낼 때 .get으로 접근
    public String solution(String str){
        Stack<Character> st = new Stack<>();
        String answer ="";
        for(char x : str.toCharArray()){
            if(x==')'){
                while(st.pop()!='(');
            }
            else st.push(x);
        }

        //get으로 접근해야 앞에서부터 빼올 수 있다.
        for(int i=0; i<st.size(); i++){
            answer +=st.get(i);
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