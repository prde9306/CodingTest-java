package LeetCode.Medium;

public class ZigZagConversion {
    //CharAt 아니면 substirng 이 아닌가??

    public String convert(String s, int numRows) {
        if(s.length() == numRows){
            return s;
        }
        if(numRows == 1){
            return s;
        }
        //여기부터
        String[] rowStr = new String[numRows];
        for(int i=0; i< numRows; i++){
            rowStr[i] = "";
        }
        //이게 정확히 어떻게 들어가나??
        //[P,A,Y,P,A,L..이렇게 들어가는 것]
        String[] strs = s.split("");

        int rowNum = 0;
        boolean isPlus = true;
        for(String str : strs){
            rowStr[rowNum] += str;

            if(isPlus){
                rowNum++;
            }else{
                rowNum--;
            }
            //0,1,2에서 방향전환
            if(rowNum == numRows-1) {
                isPlus = false;
            }
            //2,1,0에서 방향전환
            if(rowNum == 0) {
                isPlus = true;
            }
        }
        //여기까지가 핵심
        String answer = "";
        for(String str : rowStr){
            answer += str;
        }
        return answer;
    }
}


