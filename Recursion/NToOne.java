package Recursion;

import java.util.Scanner;

public class NToOne {
     public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        myprint(num);
        scan.close();
    }  

    public static void myprint(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        myprint(n-1);
    }
}
