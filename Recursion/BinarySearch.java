package Recursion;

import java.util.Scanner;

public class BinarySearch{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=scan.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        //int arr[]={1,2,3,4,5};
        int s=0;
        int e=arr.length-1;
        System.out.print("Enter key to be searched: ");
        int target=scan.nextInt();
        int pos=search(arr,target,s,e);
        System.out.println(pos+1);
        scan.close();
    }
    
    public static int search(int arr[],int t,int s,int e){
        if(s>e){
            return -1;
        }
        int mid=(s+e)/2;
        if(arr[mid]==t){
            return mid;
        }
        if(t<arr[mid]){
            return search(arr,t,s,mid-1);
        }
        return search(arr,t,mid+1,e);
    }
}