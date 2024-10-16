class buySell {
    public int maxProfit(int[] prices) {
        int curMaxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            for(int j = i + 1; j < prices.length; j++){
                if(prices[j] - prices[i] > curMaxProfit){
                    curMaxProfit = prices[j] - prices[i];
                }
            }
        }

        return curMaxProfit;
        
        
    }

    public static void main(String[] args){
    buySell solution = new buySell();
    int[] prices1 = {7,1,5,3,6,4};
    int[] prices2 = {7,6,4,3,1};
    int[] prices3 = {1,2,3,4,5};
    int[] prices4 = {5,4,3,2,1};
    int[] prices5 = {10,1,5,6,7,1};

    System.out.println("Expected: 5, Got: " + solution.maxProfit(prices1));
    System.out.println("Expected: 0, Got: " + solution.maxProfit(prices2));
    System.out.println("Expected: 4, Got: " + solution.maxProfit(prices3));
    System.out.println("Expected: 0, Got: " + solution.maxProfit(prices4));
    System.out.println("Expected: 6, Got: " + solution.maxProfit(prices5));
    }
}