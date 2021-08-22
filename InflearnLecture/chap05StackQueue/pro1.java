package InflearnLecture.chap05StackQueue;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

class Main{
    //이렇게 풀면 시간 초과 난다.

    public String solution(String str){
        Stack<Character> st = new Stack<>();
        String answer = "YES";

        for(char x : str.toCharArray()){
            if(x=='('){
                st.push(x);
            }
            else{
                /**
                 * pop하기 전에 비어있으면 틀린 것이니까
                 * 여기에 if(st.isEmpty())return "NO";이거 넣어줘야 안 틀림
                 */
                st.pop();
            }
        }
        //여는 괄호가 많을 경우
        if(!st.isEmpty()) return "NO";
        return answer;

    }

    public static void main (String[]args)throws IOException{

        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.print(T.solution(str));

    }

}