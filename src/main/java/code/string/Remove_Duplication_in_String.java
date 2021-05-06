package code.string;

import java.util.Arrays;
import java.util.LinkedHashSet;

/*
Write a return method that can remove the duplicated values from String

Ex:  removeDup("AAABBBCCC")  ==> ABC
 */
public class Remove_Duplication_in_String {
    public static void main(String[] args) {
        String str = "AAABBBCCC";
        System.out.println("removeDuplication(str) = " + removeDuplication1(str));
    }


    public static String removeDuplication1(String str) {

        return (new LinkedHashSet<String>(Arrays.asList(str.split("")))).toString().replace(",", "").replace("[", "").replace("]", "").replace(" ","");
    }

    public static String removeDuplication2(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(str.charAt(i) + "")) {
                result += str.charAt(i) + "";
            }

        }
        return result;
    }
}
