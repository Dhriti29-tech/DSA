class Solution {
    public int climbStairs(int n) {
        if (n==1) return n;
        if (n==2) return n ;

        // return climbStairs(n-1)+climbStairs(n-2);

        int first = 1 ;
        int second = 2;
        int res = 0 ;

        for (int i = 3 ; i<= n  ; i++){
            res = first + second ;
            first = second ;
            second = res ;
        }
        return res;
    }
}