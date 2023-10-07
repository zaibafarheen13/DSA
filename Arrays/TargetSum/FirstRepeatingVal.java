// For an array of integers return the first value that is repeating in the array
package Arrays.TargetSum;

import java.util.Arrays;

public class FirstRepeatingVal {
    static int[] arr={1,2,3,4,2,5,6,2};
    public static void main(String args[]){
        System.out.println(Arrays.toString(arr));
        System.out.println("First Repeating Value in the given array is: "+firstRepeatingValue(arr));
      }

      static int firstRepeatingValue(int[] arr){
        for(int i=0;i<arr.length;i++){//first number
            for(int j=i+1;j<arr.length;j++){//second number
                if(arr[i]==arr[j]){
                    System.out.println("The posiiton of first repeating value is: "+i);
                   return arr[i];
                }
            }
        }
        return -1;
     }
}
