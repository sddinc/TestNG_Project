package code.array;

import java.util.Arrays;

/*
        Write a method that can find the maximum number from an int Array
 */
public class Find_Min_in_Array {

    public static void main(String[] args) {

        int[] arr={2,33,6,5,4,55,36};
        System.out.println("minNumInArray(arr) = " + minNumInArray(arr));
        System.out.println("minNumInArray2(arr) = " + minNumInArray2(arr));

    }

    public static int minNumInArray(int[] arr){
        int min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static int minNumInArray2(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }


}
