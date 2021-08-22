package InflearnLecture.chap06;

public class pro7 {

    //sol1   정렬하는 법 암기해야
    /**
     * import java.io.IOException;
     * import java.util.ArrayList;
     * import java.util.Scanner;
     *
     * class Point implements Comparable<Point>{
     *    public int x, y;
     *
     *    Point(int x, int y){
     *       this.x = x;
     *       this.y = y;
     *    }
     *    //외워야
     *    @Override
     *    public int compareTo(Point o){
     *       //this객체가 앞에 있고 o가 뒤에있도록 정렬하려면 음수가 나오게(오름차순)
     *       if(this.x ==o.x) return this.y -o.y;
     *       else return this.x -o.x;
     *
     *    }
     *
     * }
     * class Main{
     *
     *    public static void main(String[]args)throws IOException{
     *
     *
     *       Scanner sc = new Scanner(System.in);
     *
     *       int N = sc.nextInt();
     *       //새로운 클래스를 만들어야
     *       ArrayList<Point> arr = new ArrayList<>();
     *       for(int i=0; i<N; i++){
     *          int x = sc.nextInt();
     *          int y = sc.nextInt();
     *          arr.add(new Point(x, y));
     *       }
     *       //정렬 불러오는 것
     *       Collections.sort(arr);
     *       for(Point o : arr){System.out.println(o.x+" "+o.y);
     *    }
     *
     *    }
     * }
     */



}
