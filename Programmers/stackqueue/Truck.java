package Programmers.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class Truck {
    //sol1
    public int solution( int bridge_length, int weight, int[] truck_weights ) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList();

        int max =0;
        for(int i=0; i<truck_weights.length; i++){
            while (true){
                if(queue.isEmpty()){
                    queue.offer(truck_weights[i]);
                    max +=truck_weights[i];
                    answer++;
                    break;
                }else if(queue.size()==bridge_length){
                    max -= queue.poll();
                }else {
                    if(max + truck_weights[i] > weight){
                        queue.offer(0);
                        answer++;
                    }else {
                        queue.offer(truck_weights[i]);
                        max +=truck_weights[i];
                        answer++;
                        break;
                    }
                }
            }

        }
        return answer + bridge_length ;
    }

/**
 sol2. 향상된 for문으로 표현하기
 for(int w : truck_weights){
 ~~~
 }

 https://rooted.tistory.com/22
 **/
}

