class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;

        int start = 0;
        long product = 1;
        int ans = 0;

        for (int end = 0; end < nums.length; end++) {
            product *= nums[end];

            while (product >= k) {
                product /= nums[start];
                start++;
            }

            ans += (end - start + 1);
        }

        return ans;
    }
}
