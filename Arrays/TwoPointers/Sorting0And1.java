// Sort an array consisting of only 0s and 1s
package Arrays.TwoPointers;

import java.util.Arrays;

public class Sorting0And1 {
    static int[] arr={1,0,1,0,0,0,1,1,1,1,0,1,0,0,1,0};
    public static void main(String args[]){
        System.out.println(Arrays.toString(arr)); 
        sort0And1(arr);
        System.out.println(Arrays.toString(arr)); 
        } 
    
    static void sort0And1(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]==0){
            left++;
        }
        if(arr[right]==1){
            right--;
        }
        if(arr[left]==1 && arr[right]==0){
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
