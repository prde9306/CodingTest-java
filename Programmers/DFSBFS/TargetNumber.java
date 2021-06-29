package Programmers.DFSBFS;
import java.util.*;

/**
 * 프로그래머스 DFS,BFS 타겟 넘버
 * n개의 음이 아닌 정수가 있습니다. 이 수를 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다. 예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.
 *
 * -1+1+1+1+1 = 3
 * +1-1+1+1+1 = 3
 * +1+1-1+1+1 = 3
 * +1+1+1-1+1 = 3
 * +1+1+1+1-1 = 3
 * 사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한사항
 * 주어지는 숫자의 개수는 2개 이상 20개 이하입니다.
 * 각 숫자는 1 이상 50 이하인 자연수입니다.
 * 타겟 넘버는 1 이상 1000 이하인 자연수입니다.
 *
 * 입출력 예
 * numbers	target	return
 * [1, 1, 1, 1, 1]	3	5
 */

import java.util.*;
class TargetNumber {

    //sol1
    static int[] number;
    static int answer = 0;
    static int target_num;
    public static int solution(int[] numbers, int target) {

        target_num = target;
        number = numbers;
        dfs(0,0);
        return answer;
    }
    public static void dfs(int level, int sum) {
        if(level==number.length) {
            if(sum == target_num) {
                answer++;
            }
            return ;
        }
        int num = number[level];
        int minus_num = num*-1;
        dfs(level+1,sum+minus_num);
        dfs(level+1,sum+num);
    }

    //sol2
    public int solution2(int[] numbers2, int target2) {
        int answer = 0;
        answer = dfs(numbers2, 0, 0, target2);
        return answer;
    }
    int dfs(int[] numbers2, int level2, int sum, int target2) {
        if(level2 == numbers2.length) {
            if(sum == target2) {
                return 1;
            }
            return 0;
        }
        return dfs(numbers2, level2 + 1, sum + numbers2[level2], target2) +
                dfs(numbers2, level2 + 1, sum - numbers2[level2], target2);
    }

    //sol3
    public int solution3(int[] numbers, int target) {
        int answer = 0;

        answer = bfs(numbers, target, numbers[0], 1) + bfs(numbers, target, -numbers[0], 1);

        return answer;
    }

    public int bfs(int[] numbers, int target, int sum, int i) {

        if(i == numbers.length) {
            if(sum == target) {
                return 1;
            } else {
                return 0;
            }
        }

        int result = 0;
        result += bfs(numbers, target, sum+numbers[i], i+1);
        result += bfs(numbers, target, sum-numbers[i], i+1);
        return result;
    }


}