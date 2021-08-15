package inflearn.dynamic;

public class pro4 {
    /**
     * import java.io.IOException;
     * import java.util.ArrayList;
     * import java.util.Arrays;
     * import java.util.LinkedList;
     * import java.util.Scanner;
     *
     * import org.graalvm.compiler.nodes.cfg.Block;
     *
     * class block implements Comparable<block>{
     *     int width, height, weight;
     *     public block(int width, int height, int weight){
     *         this.width = width;
     *         this.height = height;
     *         this.weight = weight;
     *     }
     *     @Override
     *     public int compareTo(block ob){
     *         return ob.width - this.width;
     *     }
     * }
     *
     * class Main{
     *
     *     static int[]dy;
     *     public int solution(ArrayList<Block> arr){
     *     int answer = 0;
     *     Collections.sort(arr);
     *     //첫번째 벽돌의 높이
     *     dy[0]=arr.get(0).h;
     *
     *     answer = dy[0];
     *     for(int i=1; i<arr.size(); i++){
     *         int max_h =0;
     *         for(int j=i-1; j>=0; j--){
     *             if(arr.get(j).weight > arr.get(i).weight&& dy[j]>max_h){
     *                 max_h=dy[j];
     *             }
     *         }
     *         dy[i]= max_h+arr.get(i).height;
     *         answer = Math.max(answer, dy[i]);
     *     }
     *     return answer;
     *
     *     }
     *
     *     public static void main(String[] args)throws IOException {
     *
     *         Main T = new Main();
     *         Scanner sc = new Scanner(System.in);
     *         ArrayList<block> arr = new ArrayList<>();
     *
     *         int N = sc.nextInt();
     *
     *
     *         for(int i=0; i<N; i++){
     *             int width = sc.nextInt();
     *             int height = sc.nextInt();
     *             int weight = sc.nextInt();
     *             arr.add(new block(width, height, weight));
     *
     *         }
     *
     *         System.out.print(T.solution(arr));
     *
     *     }
     * }
     */
}
