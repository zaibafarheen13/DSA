package Recursion.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearchSingleOcc {
    static ArrayList<Integer> ans=new ArrayList<>();
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
        System.out.print("Enter target to be searched: ");
        int target=scan.nextInt();
        boolean index=lsearch(arr,target,0);
        System.out.println("Element found at index: "+index);
        int indexint=lsearchindex(arr,target,0);
        System.out.println("Element found at index: "+indexint);
        int indexintlast=lsearchindex(arr,target,arr.length-1);
        System.out.println("Element found at index: "+indexintlast);
        lsearchindexall(arr,target,0);
        System.out.println("Element found at index: "+list);
        lsearchlist(arr,target,0,ans);
        System.out.println("Element found at index: "+ans);
        System.out.println("Element found at index: "+lsearchlist2(arr,target,0));
        scan.close();
    }
    
    public static boolean lsearch(int arr[],int target,int index){
       if(arr.length==index){
        return false;
       }
       return (arr[index]==target) || lsearch(arr,target,index+1);
       
    }

    public static int lsearchindex(int arr[],int target,int index){
       if(arr.length==index){
        return -1;
       }
       if(arr[index]==target){
        return index;
       } 
       else{
        return lsearchindex(arr,target,index+1);
       }
    }

     public static int lsearchindexlast(int arr[],int target,int index){
       if(arr.length==index){
        return -1;
       }
       if(arr[index]==target){
        return index;
       } 
       else{
        return lsearchindex(arr,target,index-1);
       }
    }

    //for multiple occurences
    static ArrayList<Integer> list=new ArrayList<>();
    public static void lsearchindexall(int arr[],int target,int index){
       if(arr.length==index){
        return;
       }
       if(arr[index]==target){
        list.add(index);
       } 
        lsearchindexall(arr,target,index+1);
    }

    public static void lsearchlist(int[] arr,int target,int index,ArrayList<Integer> ansl){
        if(arr.length==index){
        return;
       }
       if(arr[index]==target){
        ansl.add(index);
       } 
        lsearchlist(arr,target,index+1,ansl);
    }

    public static ArrayList<Integer> lsearchlist2(int[] arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<Integer>();
        if(arr.length==index){
        return list;
       }
       if(arr[index]==target){
        list.add(index);
       } 
        ArrayList<Integer> listall=lsearchlist2(arr,target,index+1);
        list.addAll(listall);
        return list;
      }
}

