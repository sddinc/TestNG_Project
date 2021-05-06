package code.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Write a return  method that can find the unique characters from the String

Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

 */
public class Find_the_unique {
    public static void main(String[] args) {
        String str="AAABBBCCCDEF";
        System.out.println("Result: " + unique4(str));

    }

    public static String unique(String str){
        String unique="";

        for (int k = 0; k <str.length() ; k++) {
            int count=0;
            for (int i = 0; i <str.length() ; i++) {
                if(str.charAt(k)==str.charAt(i)){
                    count++;
                }

            }
            if(count==1){
                unique+=""+str.charAt(k);
            }


        }




        return unique;
    }

    public static String unique3(String str){

        String result="";

        for (int i = 0; i <str.length() ; i++) {
            if(!result.contains(str.charAt(i)+"")){
                result+=str.charAt(i)+"";
            }
        }


        return result;
    }

    public static String unique4(String str){
        Set<String> stringSet=new HashSet<>(Arrays.asList(str.split("")));
        String result="";
        for (String each: stringSet) {
            result+=each;
        }
        return result;
    }

}
