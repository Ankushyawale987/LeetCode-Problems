class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int maxProfit = 0;
        int totalProfit = 0;
        for(int i=0;i<worker.length;i++){
            int ability = worker[i];
            for(int j=0;j<difficulty.length;j++){
                if(ability >= difficulty[j]){
                    maxProfit = Math.max(maxProfit, profit[j]);
                }
            }
            totalProfit += maxProfit;
            maxProfit = 0;
        }
        return totalProfit;
    }
}