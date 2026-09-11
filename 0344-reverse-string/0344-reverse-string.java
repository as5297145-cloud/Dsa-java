class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while(start<=end){
            swap(s,start,end);
            start++;
            end--;
        }
    }
    public void swap(char[] s,int f,int e){
        char t = s[f];
        s[f]=s[e];
        s[e]=t;
    }
}