package inflearn.chap04;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

class Main{

    public String solution(String A, String B){

        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for(char key : A.toCharArray()){
            map.put(key, map.getOrDefault(key, 0)+1);
        }
        for(char key : B.toCharArray()){
            if(!map.containsKey(key)||map.get(key)==0) return "NO";
            map.put(key, map.get(key)-1);
        }
        return answer;

    }

    public static void main(String[]args)throws IOException {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.print(T.solution(A, B));

    }
}