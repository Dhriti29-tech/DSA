class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] arr=new int[2];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j==n&& noZero(i)&&noZero(j)){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }
        return arr;
        
    }
    public boolean noZero(int num){
        while(num>0){
            if (num % 10 == 0) 
               return false;
            num /= 10;
        }
        return true;
    }
}