package inflearn.chap04;

public class pro4 {
    /**
     *   public int solution(String S, String T){
     *         int answer =0;
     *         HashMap<Character, Integer> am = new HashMap<>();
     *         HashMap<Character, Integer> bm = new HashMap<>();
     *
     *         for(char x : T.toCharArray()){
     *             bm.put(x, bm.getOrDefault(x, 0)+1);
     *         }
     *
     *         int L =T.length()-1;
     *         //여기서는 3개 다 넣지 말고 3개 -1(뒤에서 1개 는 일단 보류)
     *         for(i=0; i<L; i++){
     *             am.put(S.charAt(i)), am.getOrDefault(S.charAt(i)), 0)+1);}
     *
     *         //lt, rt 이용해서 옆으로 이동하기
     *             int lt =0;
     *         for(int rt=L; rt<S.length(); rt++){
     *             am.put(S.charAt(rt), am.getOrDefault(S.charAt(rt), 0)+1);
     *             if(am.equals(bm)) answer++;
     *             am.put(S.charAt(lt), am.get(a.charAt(lt))-1);
     *             if(am.get(S.charAt(lt)==0) am.remove(S.charAt(lt));
     *             lt++;
     *
     *         }
     */
}
