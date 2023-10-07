// In an array a'a move all even integers at the beginning followed by all odd integers
package Arrays.TwoPointers;

import java.util.Arrays;

public class SortEvenOdd {
    static int[] arr={2,4,1,3,7,6,9,18,33,22};
    public static void main(String args[]){
        System.out.println(Arrays.toString(arr)); 
        sortEvenOdd(arr);
        System.out.println(Arrays.toString(arr)); 
        } 
    
    static void sortEvenOdd(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]%2==0){
            left++;
        }
        if(arr[right]%2!=0){
            right--;
        }
        if(arr[left]%2!=0 && arr[right]%2==0){
            swap(arr,left,right);
            left++;
            right--;
        }
        }
    }

    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
     }
}
