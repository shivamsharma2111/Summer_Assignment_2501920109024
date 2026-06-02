public class besttimetobuy {

    public static int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        int maxprofit=0;
        for(int i=0; i<prices.length; i++){
            if(min>prices[i]){
                min=prices[i];
            }
            else if(min<prices[i]){
                profit=prices[i]-min;
                if (maxprofit<profit){
                    maxprofit=profit;
                }
            }

        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        int x = maxProfit(arr);
        System.out.println(x);
    }

}