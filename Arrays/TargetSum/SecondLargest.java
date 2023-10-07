// Program to find the second largest element in the given array
package Arrays.TargetSum;

import java.util.Arrays;

public class SecondLargest {
    static int[] arr={1,2,2,1,3};
    public static void main(String args[]){
        System.out.println(Arrays.toString(arr));
        System.out.println("Second maximum number in the given array is: "+findSecondMax(arr));
      }

      static int findMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
      }
      static int findSecondMax(int[] arr){
        int max=findMax(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax=findMax(arr);
        return secondMax;
      }
}
