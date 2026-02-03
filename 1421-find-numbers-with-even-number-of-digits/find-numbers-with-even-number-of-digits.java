class Solution {
    public int findNumbers(int[] nums) {
        int final1=0;
        for(int i=0;i<nums.length;i++){
             int count=0;
            while(nums[i]!=0){
                int ld=nums[i]%10;
                count++;
                nums[i]=nums[i]/10;
            }
            if(count%2==0){
                final1++;
            }
        }
        return final1;
        
    }
}