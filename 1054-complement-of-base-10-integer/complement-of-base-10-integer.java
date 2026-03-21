class Solution {
    public int bitwiseComplement(int n) {
        String ans="";
        String binary =Integer.toBinaryString(n);

        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                ans=ans+'0';
            }else{
                ans=ans+'1';
            }
        }
        int num = Integer.parseInt(ans, 2);
        return num;
        
    }
}