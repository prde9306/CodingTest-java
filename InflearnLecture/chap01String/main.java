package InflearnLecture.chap01String;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class main{

    public ArrayList<Integer> solution(String str, Character target){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            if(target == str.toCharArray()[i]) answer.add(i);
        }
        System.out.println(answer);

        return answer;

    }



    public static void main(String[] args)throws IOException {

        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char target = sc.next().charAt(0);

        T.solution(str, target);


    }
}