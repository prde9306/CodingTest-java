package InflearnLecture.chap02Array;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point>{

    int x, y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point ob){

        if(ob.x==this.x){
            return this.y - ob.y;
        }
        return this.x - ob.x;
    }
}
class Main{

    public static void main(String[] args)throws IOException {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Point> arr = new ArrayList<>();

        for(int i=0; i<N; i++){
            int x= sc.nextInt();
            int y=sc.nextInt();
            arr.add(new Point(x, y));
        }

        Collections.sort(arr);

        for(Point c  : arr){
            System.out.println(c.x+" "+c.y);
        }

    }
}


