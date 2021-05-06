package code.string;
/*
1. Write a program to swap 2 string without a
temporary variable? Swap 2 strings without a temporary variable?
 */
public class Swap_2_String_without_a_temporary {
    public static void main(String[] args) {
        String a="Emir";
        String b="Tahir";
        swap2Numbers(a,b);

        
    }


    public static void swap2Numbers(String a, String b){
      a=a+b;//EmirTahir
        //
      b=a.substring(0,a.length()-b.length());
      a=a.substring(b.length());

        System.out.println("a = " + a+"\nb= "+b);


    }
}
