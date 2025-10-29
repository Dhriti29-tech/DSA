class Solution {
    public int searchInsert(int[] nums, int target) {
        int sum=0;
        int lst=nums.length-1;

        while(sum<=lst){
           int mid=sum+(lst-sum)/2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                sum= mid+1;
            }
            else{
                lst= mid-1;
            }
        }
        return sum;
        
    }
}