package Recursion;

import java.util.Scanner;

public class ReverseNumber {
    static int sum=0;
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        int ans=reverseNum(num);
        System.out.println("Reversed number: "+ans);
        scan.close();
    }  

    public static int reverseNum(int n){
        if(n==0){
            return sum;
        }
        int rem=n%10;
        sum=sum*10+rem;
        return reverseNum(n/10);
    }
}
