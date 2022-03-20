// sol1. time limit

class sellStock {

    public int maxProfit1(int[] prices) {

        int max = 0;
        int sum;

        for(int i=0; i<prices.length-1; i++){
            for(int j=i+1; j<prices.length; j++){
                if(prices[i]<prices[j]){
                    sum= prices[j]-prices[i];
                    if(max<sum){
                        max = sum;
                    }
                }
            }
        }
        return max;
    }

    public int maxProfit2(int[] prices) {

        if (prices == null || prices.length == 0)
            return 0;

        int max = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i+1; j < prices.length; j++) {

                int max_profit = prices[j] - prices[i];

                max = Math.max(max, max_profit);

            }
        }
        return max;
    }
    // binarySearch - 오름차순, 내림차순으로 정렬 불가 따라서 binarySearch는 안 될 듯 00

    //
        public int maxProfit3(int[] prices) {
            int min_num = Integer.MAX_VALUE;
            int max_num = Integer.MIN_VALUE;
            int min_index = -1;
            int res = 0;

            for(int i=0; i<prices.length; i++) {
                if(prices[i] < min_num) {
                    min_num = prices[i];
                    min_index = i;
                }
                if((prices[i] > min_num) && (i > min_index)) {
                    res = Math.max(res, prices[i] - min_num);
                }
            }
            return res;
        }

}
