// Given an array of integers of size n, answer q queries to print the sum of values in a given range of indices from l to r
package Arrays.PrefixSumProblems;
import java.util.Scanner;
import java.util.Arrays;

public class PrefixSumInRange {
    static int[] arr={2,3,4,5,6};
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter number of queries: ");
        int q=scan.nextInt();
        int[] prefSum=runningSum(arr);
        while(q-->0){
            System.out.println("Enter range: ");
            int l=scan.nextInt();
            int r=scan.nextInt();
            int ans=prefSum[r]-prefSum[l-1];
            System.out.println(ans);
        }
        scan.close();
      }

    static int[] runningSum(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
     }
}
