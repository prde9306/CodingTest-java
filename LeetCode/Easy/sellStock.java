// sol1. time limit

class sellStock {
    public int maxProfit(int[] prices) {

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


}
