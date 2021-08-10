package inflearn.chap06;

public class pro2 {
    //버블 정렬
    // 앞뒤 나란히 비교
    //가장 큰 수가 제일 뒤로 가게 되어있음
    public int[] solution(int n, int[]arr){
      //하나 적게 돌아도 된다.
       for(int j=0; j<n-1; j++) {
           for (int i = 0; i < n -j-1; i++) {
               if (arr[i] > arr[i + 1]) {
                   int tmp = arr[i];
                   arr[i] = arr[i + 1];
                   arr[i + 1] = tmp;
               }
           }
       }
        return arr;
    }

}
