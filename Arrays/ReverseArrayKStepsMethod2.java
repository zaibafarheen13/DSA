// Rotate array by 'k' steps without extra space
package Arrays;

import java.util.Arrays;

public class ReverseArrayKStepsMethod2 {
    static int[] arr={1,2,3,4,5};
    public static void main(String args[]){
        int k=3,n=arr.length;
        System.out.println(Arrays.toString(arr));
        rotateKSteps2(arr,k,n);
        System.out.println(Arrays.toString(arr));

     }  
     
    static void rotateKSteps2(int[] arr,int k,int n){
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
     }

     static void reverse(int[] arr,int i,int j){
        while(i<j){
            swap1(arr,i,j);
            i++;
            j--;
        }
     }

     static void swap1(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
     }
}
