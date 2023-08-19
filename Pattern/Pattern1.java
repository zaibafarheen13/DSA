import java.util.Scanner;
class pattern1{
    public static void pattern(int n){
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
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


