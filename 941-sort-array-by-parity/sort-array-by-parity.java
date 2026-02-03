class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr1=new int[nums.length];
        int k=0;
        for(int n:nums){
            if(n%2==0){
                arr1[k]=n;
                k++;
            }
        }
        for(int n:nums){
            if(n%2!=0){
                arr1[k]=n;
                k++;
            }
        }
        return arr1;
        
    }
}