// Reverse an array
package Arrays;

import java.util.Arrays;

public class ReverseArray {
      public static void main(String args[]){
        int[] arr={2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        arr=reverse(arr);
        System.out.println(Arrays.toString(arr));
      }

      static int[] reverse(int[] arr){
        int j=0;
        int[] ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            ans[j]=arr[i];
            j++;
        }
        return ans;
     }
}
