// Swap using temporary variable
package Arrays;

import java.util.Arrays;

public class SwappingValues {
     public static void main(String args[]){
        int[] arr={2,3,4,5,6};
        int a=1,b=2;
        System.out.println(Arrays.toString(arr));
        arr=swap(arr,a,b);
        System.out.print(Arrays.toString(arr));

     }  
     
     static int[] swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        return arr;
     }
}

