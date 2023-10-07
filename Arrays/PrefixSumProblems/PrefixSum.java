// Given an integer array 'a', return the prefix sum/running sum in the same array
package Arrays.PrefixSumProblems;

import java.util.Arrays;

public class PrefixSum {
    static int[] arr={2,3,4,5,6};
    public static void main(String args[]){
        System.out.println(Arrays.toString(arr));
        arr=runningSum(arr);
        System.out.println(Arrays.toString(arr));
      }

      static int[] runningSum(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
     }
}
