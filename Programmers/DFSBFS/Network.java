package Programmers.DFSBFS;

/**
 * 프로그래머스 dfs, bfs 네트워크 문제
 * <p>
 * <p>
 * 네트워크란 컴퓨터 상호 간에 정보를 교환할 수 있도록 연결된 형태를 의미합니다.
 * 예를 들어, 컴퓨터 A와 컴퓨터 B가 직접적으로 연결되어있고, 컴퓨터 B와 컴퓨터 C가 직접적으로 연결되어 있을 때 컴퓨터 A와 컴퓨터 C도 간접적으로 연결되어 정보를 교환할 수 있습니다.
 * 따라서 컴퓨터 A, B, C는 모두 같은 네트워크 상에 있다고 할 수 있습니다.
 * <p>
 * 컴퓨터의 개수 n, 연결에 대한 정보가 담긴 2차원 배열 computers가 매개변수로 주어질 때, 네트워크의 개수를 return 하도록 solution 함수를 작성하시오.
 * <p>
 * 제한사항
 * 컴퓨터의 개수 n은 1 이상 200 이하인 자연수입니다. -> 이거 밑에 1줄 이 단서임.
 * 각 컴퓨터는 0부터 n-1인 정수로 표현합니다.
 * i번 컴퓨터와 j번 컴퓨터가 연결되어 있으면 computers[i][j]를 1로 표현합니다.
 * computer[i][i]는 항상 1입니다.
 * <p>
 * <p>
 * 입출력 예
 * n	computers	                       return
 * 3	[[1, 1, 0], [1, 1, 0], [0, 0, 1]]	2
 * 3	[[1, 1, 0], [1, 1, 1], [0, 1, 1]]	1
 */
//sol1.
public class Network {

    // 대칭임을 활용
    // 1 봤으면 2는 3부터, 3은 4부터확인..(무조건 dfs)(생각함, dfs어떻게 짤지 생각 못함)
    // 연결되어 있는지를 어떻게 찾지-> 이것도 생각 못함함
            public int solution(int n, int[][] computers) {
                int answer = 0;
                boolean[] network = new boolean[n];

                for (int node = 0; node < n; node++) {
                    if (!network[node]) {
                        dfs(computers, node, network);
                        answer++;
                    }
                }

                return answer;
            }

            boolean[] dfs(int[][] computers, int node, boolean[] visited) {
                visited[node] = true;

                for (int idx = 0; idx < computers.length; idx++) {
                    if (node != idx && computers[node][idx] == 1 && visited[idx] == false) {
                        visited = dfs(computers, idx, visited);
                    }
                }
                return visited;
            }
        }
