package code.int_;

public class SumOfDigit {


    // Function to get sum of digits
    public static double getSum(int n) {
        int sum = 0;
        int count = 0;
        while (n != 0) {
            sum = sum + n % 10;
            count++;
            n = n / 10;
        }

        return sum / count;
    }

    // Driver program
    public static void main(String[] args) {
        int n = 687;


        System.out.println("sum = " + getSum(687));
    }


}

