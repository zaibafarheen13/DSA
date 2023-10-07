package Arrays;

import java.util.Arrays;

public class TwoPointerReverse {
     public static void main(String args[]){
        int[] arr={2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        arr=reverse(arr);
        System.out.println(Arrays.toString(arr));
      }

      static int[] reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        int[] ans=new int[arr.length];
        while(j>=0){
            ans[i]=arr[j];
            i++;
            j--;
        }
        
        return ans;
     }
}
