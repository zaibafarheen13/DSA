import java.util.Scanner;
class pattern8{
    public static void pattern(int n){
        for(int row=0;row<n;row++){
            for(int space=1;space<n-row;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=2*row+1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
    Scanner myscan=new Scanner(System.in);
    System.out.print("Enter the number: ");
    int no=myscan.nextInt();
     pattern(no);
     myscan.close();
    }
}



