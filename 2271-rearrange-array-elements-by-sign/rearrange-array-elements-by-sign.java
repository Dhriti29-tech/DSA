class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr1 =new int[nums.length];
        int k=0,p=1;
        for(int i=0;i<nums.length;i++){
            if (nums[i] > 0) {
                arr1[k] = nums[i];
                k += 2;
            } else {
                arr1[p] = nums[i];
                p += 2;
            }
        }
        return arr1;
    }
}