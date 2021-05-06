package code.int_;

public class palindrome {

    public static boolean isDigitPalindrome1(long number) {
        long temp = number;
        long reverse = 0;
        int numOfLoops = String.valueOf(number).length();
        String revStr = "";
        for (int i = 0; i < numOfLoops; i++) {
            revStr += temp % 10;
            temp /= 10;
        }
        reverse = Integer.parseInt(revStr);
        return reverse == number;
    }

    public static boolean isDigitPalindrome3(long number) {
        long temp = number;
        long reverseLong = 0;
        long lastDigit;
        while (temp != 0) {
            lastDigit = temp % 10;
            reverseLong = reverseLong * 10 + lastDigit;
            temp /= 10;


        }
        return reverseLong == number;
    }


}
