package Programmers.Hash;

import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        String answer = "";
        int val =0;

        for(int i=0; i<participant.length; i++){
            map.put(participant[i], map.getOrDefault(participant[i], 0)+1);
        }

        //여기 이렇게 생각하는 방법!!!
        for(String comp : completion){
            val = map.get(comp) -1;
            map.put(comp, val);
        }

        for(String key : map.keySet()){
            if(map.get(key)==1) answer = key;
        }

        return answer;
    }
}
