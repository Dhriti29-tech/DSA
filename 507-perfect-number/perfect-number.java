class Solution {
    public boolean checkPerfectNumber(int num) {
        int i=1;
        int count=0;
        int original=num;
        while(i<num){
            if(num%i==0){
                count=count+i;
            }
        i++;
        }
        if(count!=original){
            return false;
        }
        return true;
    }
}