package InflearnLecture.chap05StackQueue;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.io.IOException;

class Main{

//sol1
    public int solution(String str){
        int answer = 0;
        //여기서는 이렇게 풀어도 된다.
        for(int i=0; i<str.length(); i++){
            Stack<Integer> st = new LinkedList<>();
            if(str.charAt(i)=='(') st.push('(');
            else{
                st.pop();
                if(st.charAt(i-1)=='(') answer +=st.size();
                else answer++;
            }
        }
//sol2
        Stack<Integer> st = new LinkedList<>();
        for(char x : str.toCharArray()){
            if(x=='('){
                st.push(x);
            }else{
                if(st.peek()=='('){
                    st.pop();
                    answer +=st.size();
                }else{
                    st.pop();
                    answer+=1;
                }
            }
        }


        return answer;
    }



    public static void main(String[]args)throws IOException {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.print(T.solution(str));
    }
}