package code.int_;

import java.util.Arrays;

/*
3. Write a Java Program to print the first 10 numbers of Fibonacci series.
 */
public class Fibonacci {

    public static void main(String[] args) {
        fibonacci(10);
    }


    public static void fibonacci(int size) {
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55…
       int a,b,c;
       a=0;
       b=1;
        for (int i = 1; i < size; i++) {
            System.out.println( a+"");//0 1 1
            c=a+b;//1 2
            a=b;//1  1
            b=c;//1  2
        }

    }
    public int countEvens(int[] nums) {
        return(int) Arrays.stream(nums).filter(p->p%2==0).count();
    }


    public static int fib(int num){

        int result=0;
        int j=0;
        int z=1;

        for(int i=1; i<num; i++){

            result=j+z;
            j=z;
            z=result;

        }

        return result;

    }

}
