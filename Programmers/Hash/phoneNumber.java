package Programmers.Hash;

import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {

        boolean answer = true;

        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i< phone_book.length; i++){
            map.put(phone_book[i], i);
        }

        //이 쪽  substring 어떻게 하는지 잘 봐봐
        ///containsKey
        for(int i=0; i<phone_book.length; i++){
            for(int j=1; j<phone_book[i].length(); j++){
                if(map.containsKey(phone_book[i].substring(0, j))){
                    answer = false;
                    return answer;
                }
            }
        }
        return answer;
    }
}