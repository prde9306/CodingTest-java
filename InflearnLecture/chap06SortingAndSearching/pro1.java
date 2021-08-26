package InflearnLecture.chap06SortingAndSearching;

public class pro1 {

      //선택정렬
      public int[] solution(int N, int[]arr){
         for(int i=0; i<N; i++){
            int idx = i;
            for(int j=i+1; j<N; j++){
               if(arr[j]<arr[idx]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx]=tmp;
         }
      return arr;
      }

}
