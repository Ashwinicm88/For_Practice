

public class One_to_n_sum_without_loop {
   
 public void printNos(int N)
    {
        //Your code here
        if(N==0) return ;
        printNos(N-1);
        System.out.print(N+" ");
    }
}