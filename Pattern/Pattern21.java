import java.util.Scanner;
class pattern21{
    public static void pattern(int n){
        int count=1;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(count+" ");
                count+=1;
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


