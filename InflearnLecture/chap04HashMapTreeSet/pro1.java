package InflearnLecture.chap04HashMapTreeSet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

class Main{


    //switch문으로 풀기 가능
    public char solution(int N, String target){

        char answer =' ';

        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : target.toCharArray()){
            //getOrDefault잘 기억해
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        //아래 메소드 잘 알아둬
        //map.remove(key); -> 특정 키 삭제, A라는 키의 value를 리턴
        //map.size();
        //map.containsKey(key);
        //-ture, false 리턴함

        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
            if(map.get(key)>max) max = map.get(key);
            answer =key;
        }
        return answer;
    }


    public static void main(String[]args)throws IOException {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String target = sc.nextLine();

        System.out.print(T.solution(N, target));
    }
}