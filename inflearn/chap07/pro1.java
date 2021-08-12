package inflearn.chap07;

public class pro1 {
    /**
     *

     class Body implements Comparable<Body>{
     int x;
     int y;

     Body(int x, int y){
     this.x = x;
     this.y = y;
     }
     @Override
     public int compareTo(Body o){
     return o.x - this.x;
     //내림차순 정렬
     }
     }

     class Main{

     public int solution(int N, ArrayList<Body>arr){
     int cnt =0;
     Collection.sort(arr);
     //위에있는 정렬기준에 의해 정렬됨 .
     int max = Integer.MIN_VALUE;
     for(Body ob : arr){
     if(ob.y>max){
     max =ob.y;
     cnt ++;
     }
     }

     return cnt;
     }

     public static void main(String[] args)throws IOException {

     Main T = new Main();
     Scanner sc = new Scanner(System.in);

     int N = sc.nextInt();
     ArrayList<Body> arr = new ArrayList<>();

     for(int i=0; i<N; i++){
     int x =sc.nextInt();
     int y =sc.nextInt();

     arr.add(new Body(x, y));
     }

     }
     }
     */
}
