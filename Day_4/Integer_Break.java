package For_Practice.Day_4;

/**
 * Integer_Break
 */
public class Integer_Break {

    if(n==2||n==3) return (n-1);

        int res=1;
        while(n>4){
            n-=3;
            res*=3;
        }
        return (n*res);
}