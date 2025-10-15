class Solution {
    public boolean isPalindrome(int x){
        int original=x;
        int reverseno=0;
        while (x > 0) {
            int digit=x%10;
            reverseno=reverseno*10+digit;
            x=x/10;
        }
        if(reverseno==original){
            return true;
        }else{
            return false;
        }
    }
}