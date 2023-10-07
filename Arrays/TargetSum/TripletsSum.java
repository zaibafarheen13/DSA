//Program to count he number of triplets whose sum is equal to the given value x
package Arrays.TargetSum;

import java.util.Arrays;

public class TripletsSum {
      static int[] arr={1,4,5,6,3};
    public static void main(String args[]){
        System.out.println(Arrays.toString(arr));
        System.out.println(tripletSum(arr,12));

      }

      static int tripletSum(int[] arr,int target){
        int ans=0;
        for(int i=0;i<arr.length;i++){//first number
            for(int j=i+1;j<arr.length;j++){//second number
                for(int k=j+1;k<arr.length;k++){//third number
                if(arr[i]+arr[j]+arr[k]==target){
                    System.out.println("Triplets that sum upto "+target+" are: "+arr[i]+", "+arr[j]+" and "+arr[k]);
                    ans++;
                }
            }
        }
        }
        return ans;
     }
}
