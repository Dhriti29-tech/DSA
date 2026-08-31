class Solution {
    public int maximumCandies(int[] candies, long k) {
        int lo = 1;
        int high = 0;
        for (int candi : candies) {
            high = Math.max(high, candi);
        }
        int ans = 0;
        while (lo <= high) {
            int mid = lo + (high - lo) / 2;
            long children = 0;
            for (int candi : candies) {
                children += candi / mid;
            }
            if (children >= k) {
                ans = mid;
                lo = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}