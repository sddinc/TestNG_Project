package code.string;

import java.util.Arrays;

/*
        Write a return method that check if a string is build out of the same letters as another string.

        Ex:  same("abc",  "cab"); -> true

        same("abc",  "abb"); -> false:
 */
public class Same_letters {
    public static void main(String[] args) {
        String a = "abc";
        String b = "acb";
        System.out.println("same(a,b) = " + same(a, b));
        System.out.println("same2(a,b) = " + same2(a, b));
    }


    public static boolean same(String a, String b) {

        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        int aSum = 0;
        for (int i = 0; i < aChar.length; i++) {
            aSum += aChar[i];
        }
        int bSum = 0;
        for (int i = 0; i < bChar.length; i++) {
            bSum += bChar[i];
        }
        return aSum == bSum;


    }

    public static boolean same2(String a, String b) {
        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        Arrays.sort(aChar);
        Arrays.sort(bChar);
        String aResult="";
        for (int i = 0; i <aChar.length ; i++) {
            aResult+=""+aChar[i];
        }
         String bResult="";
        for (int i = 0; i <bChar.length ; i++) {
            bResult+=""+bChar[i];
        }

      return aResult.equals(bResult);

    }
}
