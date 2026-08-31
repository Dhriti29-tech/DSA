class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo=1;
        int high=0;

        for(int pile:piles){
            high=Math.max(high,pile);
        }
        int ans=high;
        while(lo<=high){
            int mid=lo+(high-lo)/2;
            long hrs=0;
            for (int pile : piles) {
                hrs += (pile + mid - 1) / mid;
            }
            if (hrs <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
}