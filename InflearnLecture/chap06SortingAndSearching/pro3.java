package InflearnLecture.chap06SortingAndSearching;

public class pro3 {

     public int[]solution(int n, int[]arr){
         for(int i=1; i<n; i++){
             //여기 j 변수 선언하는 거 잘봐
             int tmp = arr[i], j;
             for(j=i-1; j>=0; j--){
                 if(arr[j]>tmp) arr[j+1]=arr[j];
                 else break;
             }
            arr[j+1]=tmp;
         }
         return arr;
     }
}
