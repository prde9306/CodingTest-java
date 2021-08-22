package InflearnLecture.chap07;

public class pro2 {
    /**
     * // 회의가 가장 빨리끝난 걸 기준으로 계속 선택해야함&& 시작시간 기준으로 오름차순 . 그래야 최대한 많이 선택할 수 있음
     * // 그리디 : 가장 닥친 것부터 해결
     * class Room implements Comparable<Room>{
     *     public int s,e;
     *     Body(int s, int e){
     *         this.s = s;
     *         this.e = e;
     *     }
     *     @Override
     *     public int compareTo(Room o){
     *         if(this.e==o.e) return this.s-o.s;
     *         else return this.e-o.e;
     *         //오름차순 정렬
     *     }
     * }
     *
     * class Main{
     *
     *     public int solution(int N, ArrayList<Room>arr){
     *         int cnt =0;
     *         Collection.sort(arr);
     *         //위에있는 정렬기준에 의해 정렬됨
     *         //현재 하고 있는 회의의 끝나는 시간
     *         int et = 0;
     *         for(Time bo : arr){
     *             if(ob.s>=et){
     *                 cnt++;
     *                 et=ob.e;
     *             }
     *         }
     *         return cnt;
     *         }
     *
     *     public static void main(String[] args)throws IOException {
     *
     *         Main T = new Main();
     *         Scanner sc = new Scanner(System.in);
     *
     *         int N = sc.nextInt();
     *         ArrayList<Room> arr = new ArrayList<>();
     *
     *         for(int i=0; i<N; i++){
     *             int s =sc.nextInt();
     *             int e =sc.nextInt();
     *
     *             arr.add(new Body(s, e));
     *         }
     *
     *     }
     * }
     */
}
