// Program to find unique number in the given array
package Arrays.TargetSum;

import java.util.Arrays;

public class UniqueNumber {
    static int[] arr={1,2,2,1,3};
    public static void main(String args[]){
        System.out.println(Arrays.toString(arr));
        System.out.println("Unqiue Number in the given array is: "+uniqueNum(arr));
      }

      static int uniqueNum(int[] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){//first number
            for(int j=i+1;j<arr.length;j++){//second number
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
     }
}
