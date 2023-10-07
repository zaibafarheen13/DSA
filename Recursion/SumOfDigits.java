package Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the numbers(without spaces): ");
        int nums=scan.nextInt();
        int ans=sumOfDigits(nums);
        System.out.print("Sum of digits is: "+ans);
        scan.close();
    }  

    public static int sumOfDigits(int n){
        if(n==0){
            return n;
        }
        return n%10+sumOfDigits(n/10);
    }
}
