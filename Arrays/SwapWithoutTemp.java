// Swap using sum and difference
package Arrays;

public class SwapWithoutTemp {

    public static void main(String args[]){
        int[] arr={2,3,4,5,6};
        int a=1,b=2;
        System.out.println(a+" "+b);
        int aoriginal=a;//9
        int boriginal=b;//3
        int achanged=aoriginal+boriginal;//12
        int bchanged=achanged-boriginal;//9
        achanged=achanged-bchanged;
        System.out.println(achanged+" "+bchanged);
    }
  
}
