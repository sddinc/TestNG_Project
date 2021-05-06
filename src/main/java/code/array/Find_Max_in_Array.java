package code.array;

import java.util.Arrays;
import java.util.List;

/*
        Write a method that can find the maximum number from an int Array
 */
public class Find_Max_in_Array {

    public static void main(String[] args) {

        int[] arr = {2, 33, 6, 5, 4, 55, 36};
        System.out.println("maxNumInArray(arr) = " + maxNumInArray(arr));
        System.out.println("maxNumInArray2(arr) = " + maxNumInArray2(arr));

    }

    public static int maxNumInArray(int[] arr) {
        int max = arr[0];
        int secound = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int maxNumInArray2(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static int getMaxValue(List<Integer> arr) {
        int max = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }

        return max;

    }


}
