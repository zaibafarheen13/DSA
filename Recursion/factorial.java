package Recursion;

import java.util.Scanner;

public class factorial {
        public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        int ans=fact(num);
        System.out.print("Factorial of a number is: "+ans);
        scan.close();
    }  

    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
