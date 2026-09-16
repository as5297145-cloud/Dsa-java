class Solution {
    public int lengthOfLongestSubstring(String s) {
        int j = 0;
        String m = "";
        int max = 0;
        while(j<s.length()){
            if(m.indexOf(s.charAt(j))==-1){
                m = m + s.charAt(j);
                j++;
            }
            else{
                int index = m.indexOf(s.charAt(j)) + 1;
                m = m.substring(index);
                m = m + s.charAt(j);
                j++;
            }
            max = Math.max(max,m.length());
        }
        return max;
    }
}