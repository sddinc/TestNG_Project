package code.string;
/*
    Write a method that can return the sum of the digits in a string

 */
public class Sum_of_digits_in_a_string {
    public static void main(String[] args) {

        String str="sdfsf113s153423";
        System.out.println("sumOfDigitInAString(str) = " + sumOfDigitInAString(str));

    }



 public static int sumOfDigitInAString(String str){
     int sum =0;
     String digitString="";

     for (int i = 0; i <str.length() ; i++) {

         if(Character.isDigit(str.charAt(i))){
             sum+=Integer.parseInt(str.charAt(i)+"");
         }
     }

     return sum;
 }
}
