class Solution {
    public boolean isPalindrome(String s) {
        String c= s.replaceAll("[^a-zA-Z0-9]","");
        c=c.toLowerCase();
        int l=0;
        int u=c.length()-1;
        while(l<u){
            if(c.charAt(l) != c.charAt(u)){
                return false;
            }
            l++;
            u--;
        }
        return true;
        
    }
}