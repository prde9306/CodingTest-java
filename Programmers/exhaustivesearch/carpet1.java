package Programmers.exhaustivesearch;

public class carpet1 {
    //노란색 무조건 1개는 칠해져있음
    //노란색, 갈색 격자수로 가로 세로 추론
    //가로는 세로와 같거나 세로보다 길다
    //sol1 규칙으로 찾아보려했으나 이 규칙도 빠르게 못찾냐

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int area = brown + yellow; // 전체 격자 개수

        for (int i = 1; i <= area; i++) {
            int row = i;             // 세로
            int col = area / row;     // 가로

            // 카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 길다.
            if (row > col)
                continue;

            if ((row - 2) * (col - 2) == yellow) {
                answer[0] = col;
                answer[1] = row;
                return answer;
            }

        }

        return answer;
    }

}
