package Recursion;

import java.util.Scanner;

public class NumberPalindrome {
    static int sum=0;
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        boolean ans=reverseNum(num);
        if(ans){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        } 
        scan.close(); 
    }  

    public static boolean reverseNum(int n){
        int temp=n;
        if(n==0){
            return true;
        }
        int rem=n%10;
        sum=sum*10+rem;
        reverseNum(n/10);
        if(sum==temp){
            return true;
        }
        return false;
    }
}
