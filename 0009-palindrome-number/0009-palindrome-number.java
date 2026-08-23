class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int num = 0;
        while(x!=0){
            int rem = x % 10;
            num = (num*10) + (rem);
            x = x/10;
        }
        if(n<0){
            return false;
        }
        if(n==num)
        {
            return true;
        }
        else{
            return false;
        }
    }
}