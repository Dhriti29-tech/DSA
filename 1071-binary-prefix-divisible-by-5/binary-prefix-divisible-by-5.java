class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {

        ArrayList<Boolean> list= new ArrayList<>();
        int prefix=0;
        for(int i=0;i<nums.length;i++){
           int bit=nums[i];
           prefix=(prefix*2+bit)%5;
           list.add(prefix==0);
        }

        return list;
    }
}