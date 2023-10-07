package Sorting;
import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<=arr.length-i-1;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String args[]){
        int[] a={2,1,5,3,0};
        bubbleSort(a);
    }
}
