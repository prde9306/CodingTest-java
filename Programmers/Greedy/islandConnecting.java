package Programmers.Greedy;

import java.util.PriorityQueue;

public class islandConnecting {
/**
 * 문제 설명
 * n개의 섬 사이에 다리를 건설하는 비용(costs)이 주어질 때, 최소의 비용으로 모든 섬이 서로 통행 가능하도록 만들 때 필요한 최소 비용을 return 하도록 solution을 완성하세요.
 *
 * 다리를 여러 번 건너더라도, 도달할 수만 있으면 통행 가능하다고 봅니다. 예를 들어 A 섬과 B 섬 사이에 다리가 있고, B 섬과 C 섬 사이에 다리가 있으면 A 섬과 C 섬은 서로 통행 가능합니다.
 *
 * 제한사항
 *
 * 섬의 개수 n은 1 이상 100 이하입니다.
 * costs의 길이는 ((n-1) * n) / 2이하입니다.
 * 임의의 i에 대해, costs[i][0] 와 costs[i] [1]에는 다리가 연결되는 두 섬의 번호가 들어있고, costs[i] [2]에는 이 두 섬을 연결하는 다리를 건설할 때 드는 비용입니다.
 * 같은 연결은 두 번 주어지지 않습니다. 또한 순서가 바뀌더라도 같은 연결로 봅니다. 즉 0과 1 사이를 연결하는 비용이 주어졌을 때, 1과 0의 비용이 주어지지 않습니다.
 * 모든 섬 사이의 다리 건설 비용이 주어지지 않습니다. 이 경우, 두 섬 사이의 건설이 불가능한 것으로 봅니다.
 * 연결할 수 없는 섬은 주어지지 않습니다.
 *
 *  입출력 예
 *
 * n	costs	                                    return
 * 4	[[0,1,1],[0,2,2],[1,2,5],[1,3,1],[2,3,8]]	4
 */

class Edge implements Comparable<Edge> {
    int start, end, cost;

    public Edge(int start, int end, int cost) {
        this.start = start;
        this.end = end;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}

    class Solution {

        static int[] parent;
        static PriorityQueue<Edge> pq;

        public int solution(int n, int[][] costs) {
            int answer = 0;
            parent = new int[n];
            pq = new PriorityQueue<Edge>();

            // 정점들의 부모 설정
            for (int i = 0; i < n; i++)
                parent[i] = i;

            // 비용 적은 순서부터 우선순위 큐에 삽입
            for (int i = 0; i < costs.length; i++) {
                pq.offer(new Edge(costs[i][0], costs[i][1], costs[i][2]));
            }

            while (!pq.isEmpty()) {
                Edge edge = pq.poll();

                // 정점의 부모가 같으면 건너뜀 (사이클이 형성된 것으로 판단)
                if (find(edge.start) == find(edge.end)) continue;
                else {
                    union(edge.start, edge.end);
                    answer += edge.cost;
                }
            }

            return answer;
        }

        // find --> 정점의 부모를 찾아줌.
        public static int find(int p) {
            if (parent[p] == p) return p;
            return parent[p] = find(parent[p]);
        }

        // union --> 정점의 부모를 변경시킴으로써 서로 연결되었다는 것을 표시해줌.
        public static void union(int a, int b) {
            int rootA = find(a);
            int rootB = find(b);

            if (rootA != rootB) parent[rootB] = rootA;
        }
    }
}
