package inflearn.chap05;

public class pro8 {
    /**
     * //sol 이렇게 풀어도 되고
     *
     * public int solution(int N, int M, int[]arr){
     *     int answer =1;
     *     int target = arr[M];
     *     Queue<Integer> qu = new LinkedList<>();
     *
     *     for(int i=0; i<N; i++){
     *         qu.offer(arr[i]);
     *     }
     *
     *     for(int i=0; i<N; i++){
     *         for(int j=0; j<N; j++){
     *            if(arr[i]<arr[j]) {
     *                qu.offer(qu.poll(arr[i]));
     *                break;
     *             }
     *            else{
     *                if(arr[i]==target) return answer;
     *                qu.poll(arr[i]);
     *                answer++;
     *     }
     *         }
     *     }
     *     return answer;
     * }
     */

    //sol2 클래스 따로 만들어서
    /**
     * class Person{
     *     int id;
     *     int priority;
     *     public Person(int id, int priority){
     *         this.id = id;
     *         this.priority = priority;
     *     }
     * }
     * class Main{
     *     public int solution(int N, int M, int[]arr){
     *         int answer =0;
     *         Queue<Person> Q = new LinkedList<>();
     *         for(int i=0; i<N; i++){
     *             Q.offer(new Person(i, arr[i]));
     *         }
     *         while(!Q.isEmpty()){
     *             Person tmp = Q.poll();
     *             for(Person x : Q){
     *                 if(x.priority>tmp.priority){
     *                     Q.offer(tmp);
     *                     tmp = null;
     *                     break;
     *                 }
     *             }
     *             if(tmp!=null){
     *                 answer++;
     *                 if(tmp.id==M) return answer;
     *             }
     *         }
     *     }
     *     return answer;
     * }
     */
}
