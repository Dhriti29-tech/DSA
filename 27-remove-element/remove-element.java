class Solution {
    public int removeElement(int[] nums, int val) {
        
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] == val) {
                for(int j = nums.length-1; j > i; j--) {
                    if(nums[j] == val) continue;

                    else {
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                    }
                }
            }
        }

        int k = nums.length-1;
        int count = 0;
        while(k >= 0) {
            if(nums[k] != val) return ((nums.length) - count);
            count++;
            k--;
        }
    return ((nums.length) - count);
    }
}