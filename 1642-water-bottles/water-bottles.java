class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=numBottles;
        while(numBottles>=numExchange){
            int n=numBottles/numExchange;
            int left=numBottles%numExchange;

            total=total+n;
            numBottles=n+left;
        }
        return total;  
    }
}