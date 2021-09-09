package InflearnLecture.chap10dynamic;

import java.io.IOException;
import java.util.*;

class block implements Comparable<block>{
    int width, height, weight;
    public block(int width, int height, int weight){
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
    @Override
    public int compareTo(block ob){
        return ob.width - this.width;
    }
}

class Main{

    static int[]dy;
    public int solution(ArrayList<Block> arr){
        int answer = 0;
        Collections.sort(arr);
        //첫번째 벽돌의 높이
        dy[0]=arr.get(0).height;
        //dy는 i번째 벽돌을 맨위에 놓았을 때 그 탑의 높이
        answer = dy[0];

        for(int i=1; i<arr.size(); i++){
            int max_h =0;
            for(int j=i-1; j>=0 ; j--){
                if(arr.get(j).weight > arr.get(i).weight && dy[j]>max_h){
                    max_h = dy[j];
                }
            }
            dy[i]= max_h+arr.get(i).height;
            answer = Math.max(answer, dy[i]);
        }
        return answer;

    }

    public static void main(String[] args)throws IOException {

        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        ArrayList<block> arr = new ArrayList<>();

        int N = sc.nextInt();


        for(int i=0; i<N; i++){
            int width = sc.nextInt();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            arr.add(new block(width, height, weight));

        }

        System.out.print(T.solution(arr));

    }

    /**
     import java.io.IOException;
     import java.util.ArrayList;
     import java.util.Collections;
     import java.util.Scanner;

     class Top implements Comparable<Top>{
     int w, h, g;

     public Top(int w, int h, int g){
     this.w =w;
     this.h =h;
     this.g =g;
     }
     @Override
     public int compareTo(Top ob){
     return ob.w-this.w;
     }
     }
     class Main{

     static ArrayList<Top> arr;
     static int []dis;
     public int solution(){

     Collections.sort(arr);
     dy[0]=arr.get(0).h;
     for(int i=1; i<arr.size(); i++){
     for(int j=i-1; j>=0; j--){
     int max =0;
     if(arr.get(i).w<arr.get(j).w && dy[j]> max){
     max =dy[i];
     }
     }
     dy[i]= max+arr.get(i).h;
     answer = Math.max(answer, dy[i]);
     }
     return answer;
     }


     public static void main(String[] args) throws IOException{
     Main T = new Main();
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     arr = new ArrayList<>();
     dis = new int[N];

     for(int i=0; i<N; i++){
     int w =sc.nextInt();
     int h = sc.nextInt();
     int g =sc.nextInt();
     arr.add(new Top(w,h,g));
     }

     System.out.print(T.solution());
     }
     }
     */
}