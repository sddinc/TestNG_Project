package code.int_;
/*
1. Write a program to swap 2 numbers without a
temporary variable? Swap 2 strings without a temporary variable?
 */
public class Swap_2_numbers_without_a_temporary {
    public static void main(String[] args) {
        int a=10, b=20;
        swap2Numbers(a,b);


    }


    public static void swap2Numbers(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a = " + a+"\nb= "+b);


    }
}
