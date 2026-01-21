class Solution {
    public int hIndex(int[] citations) {
        int h=0;
        for (int candidate = 1; candidate <=citations.length; candidate++) {
            int count = 0;
            for(int i=0;i<citations.length;i++){
                if(citations[i]>=candidate){
                    count++;
                }
            }
            if(count>=candidate){
                h=candidate;
            }
        }
        return h;  
        
    }
}