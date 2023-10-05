/*
 * Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.
Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
 */
import java.util.*;
public class Number_of_good_Pairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int arr[]={1,2,3,1,1,3};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
        sc.close();
       System.out.println(count);
    }
}
