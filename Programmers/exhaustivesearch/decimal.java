package Programmers.exhaustivesearch;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//sol 1
public class decimal {
    //1, 문자를 쪼개고 int로 바꾸기
    //2. 조합을 통해 소수를 찾는다.(0이들어있을 때 주의)
    //나머지가 자기자신 외 1
    //3.  갯수를 샌다
    Set<Integer> set = new LinkedHashSet<>();
    public int solution(String numbers) {

        int answer = 0;
        int[] arr = new int[numbers.length()];
        int[] output = new int[numbers.length()];
        boolean[] visited = new boolean[numbers.length()];

        for (int i = 0; i < numbers.length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(numbers.charAt(i)));
        }
        for (int r = 1; r <= numbers.length(); r++) {
            perm(arr, output, visited, 0, numbers.length(), r);
        }

        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()){
            Integer next = itr.next();
            if (isPrime(next))
                answer++;
        }
        return answer;
    }

    void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < r; i++) {
                s.append(output[i]);
            }
            set.add(Integer.parseInt(s.toString()));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1, n, r);
                visited[i] = false;
            }
        }
    }
    boolean isPrime(int num) {
        if(num <= 1) return false;
        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }

}

