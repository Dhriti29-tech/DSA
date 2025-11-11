class Solution {
    public int secondHighest(String s) {
        String arr="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                arr=arr+ch;
            }
        }
        int largest = -1, second = -1;
        for (int i = 0; i < arr.length(); i++) {
            int digit = arr.charAt(i) - '0';
            if (digit > largest) {
                second = largest;
                largest = digit;
            } else if (digit > second && digit != largest) {
                second = digit;    
            }
        }
        return second;
        
    }
}