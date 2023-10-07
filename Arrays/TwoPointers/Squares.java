// For an array 'a' sorted in non-decreasing order, return an array of squares of each number sorted in non-decreasing order
package Arrays.TwoPointers;

import java.util.*;

public class Squares {
    //static int[] arr = {-10, -5,-2,1,4,9};
    static int[] arr = {-10, -5,-4,-3,-2};
    //note input array is sorted

    public static void main(String args[]) {
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(absSquares(arr)));
        //
    }

    static int[] absSquares(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int k = 0;
        int[] ans = new int[arr.length];
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        System.out.println(Arrays.toString(reverse1(ans)));
        return ans;
    }

    static int[] reverse1(int[] ans) {
        int j = 0;
        int[] copy = new int[ans.length];
        for (int i = ans.length - 1; i >= 0; i--) {
            copy[j] = ans[i];
            j++;
        }
         return copy;
    }
}
