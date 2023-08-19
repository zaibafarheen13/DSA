import java.util.Scanner;
class pattern11{
    public static void pattern(int n){
        for(int row=0;row<n;row++){
            for(int spaces=0;spaces<=row;spaces++){
                System.out.print(" ");
            }
            for(int col=1;col<=2*(n-row-1)+1;col++){
                if(col%2==0){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
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




