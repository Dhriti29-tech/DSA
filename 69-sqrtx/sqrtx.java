class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        int low=1;
        int heigh=x/2;
        int ans=0;

        while(low<=heigh){
            int mid=low+(heigh-low)/2;
            long square=(long) mid*mid;

            if(square==x){
                return mid;
            }
            else if(square<x){
                ans=mid;
                low=mid+1;
            }else{
                heigh=mid-1;
            }
        }
        return ans;  
    }
}