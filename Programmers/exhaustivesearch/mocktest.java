package Programmers.exhaustivesearch;

import java.util.ArrayList;
import java.util.List;

public class mocktest {
    public int []solution(int[]answers){

        int []a ={1,2,3,4,5};
        int []b ={2,1,2,3,2,4,2,5};
        int []c ={3,3,1,1,2,2,4,4,5,5};
        //아래 생각 못함
        int[]cnt = new int[3];

        for(int i=0; i<answers.length; i++){
           // 여기 a[i%5]생각 못함
           if (answers[i] == a[i%5]){
                   cnt[0]++;
            }
            if (answers[i] == b[i%5]){
                cnt[1]++;
            }
            if (answers[i] == c[i%5]){
                cnt[2]++;
            }
        }
        //1번 학생을 winner로 잡고 차례대로 비교하여 가장 높은 점수 확인
        int winner = cnt[0];
        for(int i=0; i<cnt.length; i++){
            if(winner < cnt[i]){
                winner=cnt[i];
            }
        }
        //가장 높은 점수를 받은 학생 List 생성
        List<Integer> win = new ArrayList<>();

        //cnt 배열과 가장 높은 점수를 비교하여 동일한 경우 win List에 추가
        for(int i = 0; i<cnt.length; i++){
            if(winner ==cnt[i]){
                win.add(i);
            }
        }
        int[]answer={};//출력값
        answer = new int[win.size()];
        //출력할 배열 answer에 List에 있는 학생번호 입력
        for(int i =0; i<win.size(); i++){
            answer[i] = win.get(i)+1;
        }

        return answer;
    }
}
