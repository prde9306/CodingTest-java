package inflearn.chap04HashMapTreeSet;

public class pro5 {

    /**
     * public int solution(int N, int M, int[]arr){
     *     int answer = -1;
     *     //내림차순으로 자동졍렬 , 중복제거
     *     TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
     *       for(int i=0; i<N; i++){
     *        for(int j=i+1; j<N; j++){
     *          for(int k=j+1; j<N; k++){
     *             Tset.add (arr[i]+arr[j]+arr[k]);
     *          }
     *       }
     *    }
     *    int cnt =0;
     *    for(int x: Tset){
     *       cnt++;
     *       if(cnt==k) return x;
     *       System.out.println(x);
     *    }
     * return answer;
     *
     *  Tset.first()
     *  Tset.remove()
     *
     * }
     */


}
