package code.array;

import java.util.Arrays;

public class PushZerosToEnd {
    public static void main(String[] args) {
        int arr[]=new int[5];

        int input[] = {0,4,0,1,25,0};
        System.out.println(Arrays.toString(pushZerosToEnd(input)));


    }
        public static int[] pushZerosToEnd2(int[] zeroArr) {

        int[] output = new int[zeroArr.length];
        int count = 0;
        for (int i = 0; i < zeroArr.length; i++) {
            if (zeroArr[i] != 0) {
                output[count++] = zeroArr[i];
            }
        }
        return output;
    }

    public static int[] pushZerosToEnd(int[] arr) {
        int []output=new int[arr.length];
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=0){
                output[count]=arr[i];
                count++;
            }
        }
        return output;
    }







}
