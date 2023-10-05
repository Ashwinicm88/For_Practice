class Fibbonacci_Number {
    public int fib(int n) {
        int first=0;
        int second=1;
        int num=0;
        if(n==1){
            return 1;
        }
        for(int i=1;i<n;i++){
            num=first+second;
            first=second;
            second=num;
        }
        return num;
    }
    
}
   