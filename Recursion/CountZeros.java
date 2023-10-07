package Recursion;

import java.util.Scanner;

public class CountZeros {
    static int c=0;
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        int ans=countZeros(num);
        System.out.println("Number of zeros: "+ans);
        scan.close();
    }  

    public static int countZeros(int n){
        return helper(n, c);
    }

    public static int helper(int n,int c){
        if(n==0){
            return c;
        }
        int rem=n%10;
        if(rem==0){
            return helper(n/10,c+1);
        }
        else{
             return helper(n/10,c);
        }
    }
}
