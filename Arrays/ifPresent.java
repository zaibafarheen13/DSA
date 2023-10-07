// Check if number is present in array or not
package Arrays;
import java.util.Scanner;

public class ifPresent {
    static int[] arr={1,2,3,2,1,4,5,3,3,2,4,4,4,4};
    public static void main(String args[]){
        int q=5;
        while(q>0){
        int[] ans=freqArray(arr);
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number to be searched: ");
        int x=scan.nextInt();
        if(ans[x]>0){
            System.out.println("Yes"+" "+ans[x]+" "+"times");
        }
        else{
            System.out.println("No"+" "+ans[x]+" "+"times");
        }
        q--;
        scan.close();
        }
     }  
     
    static int[] freqArray(int[] arr){
        int[] freq=new int[1005];// given your array contains max size =1000 -----> say
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
     }
}
