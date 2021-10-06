package LeetCode.Medium;

import java.util.ArrayList;
import java.util.List;

//https://minhamina.tistory.com/37 (풀이 2가지)
https://www.youtube.com/watch?v=s7AvT7cGdSo

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();

        boolean[] checked = new boolean[nums.length];
        List<Integer> perm = new ArrayList<>();
        DFS(nums, checked, perm, answer);

        return answer;
    }
    public void DFS(int[]nums, boolean []checked, List<Integer>perm, List<List<Integer>> answer){
        if(perm.size()==nums.length){
            answer.add(new ArrayList<>(perm));
            return;
        }else{
            for(int i=0; i<nums.length; i++){
                if(!checked[i]){
                    checked[i]=true;
                    perm.add(nums[i]);
                    DFS(nums, checked, perm, answer);
                    //여기 정확히 이해
                    perm.remove(perm.size()-1);
                    checked[i]=false;
                }
            }
        }
    }
}