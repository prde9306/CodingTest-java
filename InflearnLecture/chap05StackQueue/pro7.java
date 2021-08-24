package InflearnLecture.chap05StackQueue;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Main{

    //sol1 (stack으로 풀어도 됨)
    public String solution1(String str, String target){
        String answer ="NO";
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            st.push(str.charAt(i));
        }
        for(int i=target.length()-1; i>=0; i--){
            if(target.charAt(i)==st.peek()){
                st.pop();
            }
        }
        if(st.isEmpty()) return "YES";

        return answer;

    }

    //sol2Queue로 contains 활용
    //contains(x) - 이걸 알아야 한다.
    public String solutio2(String required, String test){

        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for(char x : required.toCharArray()) Q.offer(x);
        for(char x : test.toCharArray()){
            if(Q.contains(x)){
                if(x!=Q.poll()) return "NO";
            }
        }
        if(!Q.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[]args)throws IOException {

        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String required = sc.next();
        String test = sc.next();

        System.out.print(T.solution(required, test));

    }
}