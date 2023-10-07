package Sorting;

import java.util.Arrays;

public class MergeSort{
    public static int[] mergesort(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right=mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        return merges(left,right);
    }
    public static int[] merges(int[] left,int[] right)
    {
        int[] mix=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length)
        {
            if(left[i]<right[j])
            {
                mix[k]=left[i];
                i++;
            }
            else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length )
        {
            mix[k]=left[i];
            i++;
            k++;
        }
           while(j<right.length )
        {
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;
    }
    public static void main(String[] args) {
        int[] a={5,4,3,2,1};
        a=mergesort(a);
        System.out.println(Arrays.toString(a));
        
    }
}




    