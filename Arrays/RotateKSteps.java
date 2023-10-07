// Rotate array by 'k' steps
package Arrays;

import java.util.Arrays;

public class RotateKSteps {
    public static void main(String args[]){
        int[] arr={1,2,3,4,5};
        int k=3,n=arr.length;
        System.out.println(Arrays.toString(arr));
        arr=rotateKSteps(arr,k,n);
        System.out.println(Arrays.toString(arr));

     }  
     
    static int[] rotateKSteps(int[] arr,int k,int n){
        k=k%n;
        int[] ans=new int[n];
        int j=0;
        for(int i=k-1;i<=n-1;i++){
            ans[j]=arr[i];
            j++;
        }
        for(int i=n-k-1;i>=0;i--){
            ans[j]=arr[i];
            j++;
        }
        return ans;
     }
}
