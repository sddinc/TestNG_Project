package code.int_;

public class FactorialNumber {




    public static int factorialNumber(int n){

        int result = 1;

        for(int i = 1; i <= n; i++){

            result = result * i;

        }

        return result;

    }
}
