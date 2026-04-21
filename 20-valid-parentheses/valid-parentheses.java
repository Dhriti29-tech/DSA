class Solution {
    public boolean isValid(String s) {
        char[] arr=s.toCharArray();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='('||arr[i]=='{'||arr[i]=='['){
                st.push(arr[i]);
            }else{
                if(st.isEmpty())return false;
                char ch=st.peek();
                st.pop();
                if((arr[i]==')'&&ch=='(')||(arr[i]=='}'&&ch=='{')||(arr[i]==']'&&ch=='[')){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}          