package For_Practice.Day_16;

public class Sub_Prod {
    public int subtractProductAndSum(int n) {
        int rev=0;
        int reslt=0;
        int prod=1;
       while(n!=0){
           int num=n%10;
           reslt=reslt+num;
           prod=prod*num;
           n/=10;
       }
       return prod-reslt;
    }
}
