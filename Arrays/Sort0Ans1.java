package Arrays;

import java.util.Arrays;

public class Sort0Ans1 {
    static int[] arr={1,0,1,0,0,0,1,1,1,1,0,1,0,0,1,0};
    public static void main(String args[]){
        System.out.println(Arrays.toString(arr)); 
        count0And1(arr);
        System.out.println(Arrays.toString(arr)); 
        } 
    
    static void count0And1(int[] arr){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=0;i<n;i++){
            if(count>=0){
                arr[i]=0;
                count--;
            }
            else{
                arr[i]=1;
            }
        }
     }
}
