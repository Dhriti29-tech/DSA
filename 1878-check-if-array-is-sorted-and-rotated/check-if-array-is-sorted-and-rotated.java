class Solution {
    public boolean check(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            int j=(i+1)%n;
            if(nums[i]>nums[j]){
                count++;
                if(count>1)
                   return false; 
            }
        }
        return true;  
    }
}