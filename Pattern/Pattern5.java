import java.util.Scanner;
class pattern5{
    public static void pattern(int n){
        for(int row=1;row<2*n;row++){
            int condition=row>n ? n-(row-n) : row;
            for(int col=1;col<=condition;col++){
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


