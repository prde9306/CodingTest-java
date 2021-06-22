package Programmers.dfsbfs;

//단어 변환
public class Main {
    //sol1
    public class WordConversion {
        int answer;                        //최소 단계
        boolean[] used;                    //단어를 사용 중인지를 판단하는 visited와 같은 역할을 하는 배열
        public int solution(String begin, String target, String[] words) {
            answer = 51;                //단어 최대값이 50이므로
            used = new boolean[words.length];
            dfs(begin, target, 0, words);
            return answer == 51 ? 0 : answer;    //answer이 51이면 target과 같은 단어가 없는 것으로 판단.
        }

        public void dfs(String presentWord, String target, int count,String[] words) {
            if(presentWord.equals(target)) {
                answer = (answer > count) ? count : answer;
                return;
            }

            for(int i = 0; i < words.length; i++) {                        //탐색한 글자중 하나만 차이나고 탐색되지 않은 글자이 있다면. dfs 수행
                if(!used[i] && check(presentWord, words[i])) {
                    used[i] = true;
                    dfs(words[i],target,count+1, words);
                    used[i] = false;
                }
            }
        }

        public boolean check(String presentWord, String nextWord) {        //현재의 단어와 다음 단어가 바뀔 조건에 일치하는가를 체크
            int count = 0;
            for(int i = 0; i < presentWord.length(); i++) {
                if(presentWord.charAt(i) != nextWord.charAt(i)) {
                    count++;
                }
            }
            return count == 1 ? true : false;
        }
    }

    //sol2
    public class Solution_43163 {

        public static boolean[] visited;
        public static int count;
        public static void main(String[] args) {
            String begin = "hit";
            String target = "cog";
            String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
            solution(begin, target, words);
        }

        public static int solution(String begin, String target, String[] words) {
            visited = new boolean[words.length + 1];
            count = Integer.MAX_VALUE;
            dfs(begin, target, words);
            if(count == Integer.MAX_VALUE)
                count = 0;
            return count;
        }

        private static void dfs(String begin, String target, String[] words) {
            dfsUtil(begin, target, words, 0,0);
        }

        private static void dfsUtil(String begin, String target, String[] words,int check, int index) {

            if (begin.equals(target)) {
                count = Math.min(count,check);
                visited[index] = false;
                return;
            }

            visited[index] = true;
            //변환 횟수 증가
            check++;
            for (int i = 0; i < words.length; i++) {
                int wordCount = 0;
                for (int j = 0; j < words[i].length(); j++) {
                    //단어 비교 한글자만 바뀐 것 체크
                    if (begin.charAt(j) == words[i].charAt(j)) {
                        wordCount++;
                    }
                }
                if (wordCount == begin.length() - 1 && !visited[i + 1]) {
                    dfsUtil(words[i],target,words,check,i+1);
                }
            }
            //target에 도달하더라도 최소 횟수로 도달하는경우가 없을 수도 있기 때문에
            //방문 처리를 풀어 남은 dfs도 수행하도록 처리
            visited[index] = false;
            return;
        }
    }
}
