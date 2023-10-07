package Recursion.Arrays;

public class IsSorted {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,16,8};
        int start=0;
        boolean ans=sorted(arr,start);
        System.out.println(ans);
    }

    public static boolean sorted(int[] arr,int index){
        if(arr.length-1==index){
            return true;
        }
        if(arr[index]<arr[index+1] && sorted(arr,index+1)){
            return true;
        }
        return false;
    }
}
