class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.toLowerCase();
        t=t.toLowerCase();
        s=s.replace(" ","");
        t=t.replace(" ","");
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        if(Arrays.equals(chars, chars1)){
            return true;
        }else{
            return false;
        }

    }
}