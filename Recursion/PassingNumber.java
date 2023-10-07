package Recursion;

import java.util.Scanner;

public class PassingNumber {
     public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        passingNum(num);
        scan.close();
    }  

    public static void passingNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        passingNum(--n);

    }
}
