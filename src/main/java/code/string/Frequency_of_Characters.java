package code.string;


        /*
        Write a return method that can find the frequency of characters

        Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
         */

import java.util.Arrays;
import java.util.Collections;

public class Frequency_of_Characters {

    public static void main(String[] args) {
        //System.out.println("frequencyOfChars(\"AABBCDD\") = " + frequencyOfChars("AAABBCDD"));

        System.out.println("output: " + frequencyOfChar4("AAAAABBCDD"));

    }

    public static String frequencyOfChars(String str) {

        String noDuplicant = "";
        for (int i = 0; i < str.length(); i++) {
            if (!noDuplicant.contains(str.charAt(i) + "")) {
                noDuplicant += str.charAt(i) + "";
            }
        }
        System.out.println("noDuplicant = " + noDuplicant);
        String result = "";
        for (int i = 0; i < noDuplicant.length(); i++) {
            int count = Collections.frequency(Arrays.asList(str.split("")), "" + noDuplicant.charAt(i));
            result += "" + noDuplicant.charAt(i) + count;
        }

        return result;
    }

    public static String frequencyOfChars2(String str) {
        String nonDup = "";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains("" + str.charAt(i))) {
                nonDup += "" + str.charAt(i);
            }
        }
// str="AAABBCDD
        for (int k = 0; k < nonDup.length(); k++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == nonDup.charAt(k)) {
                    count++;
                }

            }
            result += nonDup.charAt(k) + "" + count;

        }


        return result;
    }

    public static String frequencyOfChars3(String str) {
        String nonDup = "";
        String result = "";

        for (int i = 0; i < str.length() - 1; i++) {
            if (!nonDup.contains("" + str.charAt(i))) {
                nonDup += "" + str.charAt(i);
            }
        }
        //ABCD

        for (int i = 0; i < nonDup.length(); i++) {
            int count = 0;
            for (int k = 0; k < str.length(); k++) {
                if (str.charAt(k) == nonDup.charAt(i)) {
                    count++;
                }
            }
            result += "" + nonDup.charAt(i) + count;

        }

        return result;
    }


    public static String frequencyOfChar4(String str) {
        String result = "";
        String[] arr = str.split("");
        String nonDup = "";
        for (int i = 0; i < arr.length; i++) {
            if (!nonDup.contains(arr[i])) {
                nonDup += arr[i];
            }
        }

        for (int i = 0; i <nonDup.length() ; i++) {
            int count = 0;
            for (int k = 0; k < str.length(); k++) {
                if (nonDup.charAt(i) == str.charAt(k)){
                    count++;
                }

            }
            result+=""+nonDup.charAt(i)+count;
        }

        return result;
    }

    public static String frequency7(String str) {

        String nonDup="", result="";

        for(int i=0; i < str.length(); i++)

            if(! nonDup.contains(""+str.charAt(i)))

                nonDup += ""+str.charAt(i);



        for(int i=0; i < nonDup.length(); i++) {

            int num = Collections.frequency( Arrays.asList(str.split("") ) ,    ""+nonDup.charAt( i ) );

            result += ""+nonDup.charAt(i) + num;

        }



        return result;

    }

}
