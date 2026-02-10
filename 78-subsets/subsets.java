class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(0,nums,res,temp);
        return res;  
    }
    public static void backtrack( int ind,int[]nums,List<List<Integer>> res,List<Integer> temp){
        if(ind==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[ind]);
        backtrack(ind+1,nums,res,temp);
        temp.remove(temp.size()-1);
        backtrack(ind+1,nums,res,temp);
    }
}