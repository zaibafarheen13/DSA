//Program to find the total numbe rof pairs in the arrays whose sum is equal to given value x
package Arrays.TargetSum;

import java.util.Arrays;

public class PairSum {
    static int[] arr={2,3,4,5,6};
    public static void main(String args[]){
        System.out.println(Arrays.toString(arr));
        System.out.println(pairSum(arr,7));
      }

      static int pairSum(int[] arr,int target){
        int ans=0;
        for(int i=0;i<arr.length;i++){//first number
            for(int j=1;j<arr.length;j++){//second number
                if(arr[i]+arr[j]==target){
                    System.out.println("Numbers that sum upto "+target+" are: "+arr[i]+" and "+arr[j]);
                    ans++;
                }
            }
        }
        return ans;
     }
}
