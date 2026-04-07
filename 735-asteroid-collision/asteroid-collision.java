class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer> st = new Stack<>();

        for(int nums:asteroids){
            int curr=nums;

            if(curr>0){
                st.push(curr);
            }
            else{
                while(!st.isEmpty() && st.peek()>0 && st.peek() <Math.abs(curr)){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()>0 && st.peek()==Math.abs(curr))
                {
                    st.pop();
                }
                else if(st.isEmpty() || st.peek()<0){
                    st.push(curr);
                }
            } 
        }
        int[] result= new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            result[i]=st.pop();
        }
        return result; 
    }
}