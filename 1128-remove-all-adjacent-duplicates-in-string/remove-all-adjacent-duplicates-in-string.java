class Solution {
    public String removeDuplicates(String s) {
        char[] arr=s.toCharArray();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(!st.isEmpty()&&arr[i]==st.peek()){
                st.pop();
            }else{
                st.push(arr[i]);
            }
        }
        StringBuilder result=new StringBuilder();
        for(char ch:st){
            result.append(ch);

        }
        return result.toString();
    }
}