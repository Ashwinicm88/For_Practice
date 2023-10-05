class Palindrome {
    public boolean isPalindrome(int x) {
        int num=0;
        int ori=x;
        int rev=0;
        if(x<0) return false;
        while(x!=0){
            num=x%10;
            rev=(rev*10)+num;
            x/=10;
        }
       
        if(ori==rev) return true;
        else return false;
    }
}