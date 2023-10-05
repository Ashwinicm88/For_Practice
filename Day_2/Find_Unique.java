/*
 * 2
5
2 4 7 2 7
9
1 3 1 3 6 6 7 10 7
Sample Output 2:
4
10
 */
import java.util.Arrays;

public class Find_Unique{  

    public static int findUnique(int[] arr){
		//Your code goes here
    int uni=0;
        for(int i=0;i<arr.length;i++){
            uni=uni^arr[i];
        }
        return uni;
}
public static void main(String[] args) {
    int arr[]={2,4,7,2,7};
    System.out.println(findUnique(arr));
}
}