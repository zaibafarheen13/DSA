package Recursion;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the numbers(without spaces): ");
        int nums=scan.nextInt();
        int ans=productOfDigits(nums);
        System.out.print("Sum of digits is: "+ans);
        scan.close();
    }  

    public static int productOfDigits(int n){
        if(n%10==n){
            return n;
        }
        return n%10*productOfDigits(n/10);
    }
}
