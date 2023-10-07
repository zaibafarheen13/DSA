package Recursion;
import java.util.Scanner;

public class OneToN {
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
        myprint(n-1);
        System.out.print(n+" ");
    }
}
