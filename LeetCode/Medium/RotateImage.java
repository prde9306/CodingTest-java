package LeetCode.Medium;

public class RotateImage {
    //새로운 배열을 선언하지 말래자

    class Solution {
        public void rotate(int[][] matrix) {
            int[][] answer = new int[matrix.length][matrix.length];
            for(int i=0; i< matrix.length; i++){
                for(int j=0; j<matrix.length; j++){
                    answer[i][j] = matrix[matrix.length-j-1][i];
                }
            }

        }
    }
}
