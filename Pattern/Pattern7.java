import java.util.Scanner;
class pattern7{
    public static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int space=1;space<=row-1;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=n-row+1;col++){
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


