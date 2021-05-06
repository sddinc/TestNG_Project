package code;


        /*
        Write a return method that can find the frequency of characters

        Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
         */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Frequency_of_Characters_maximum_char_value {

    public static void main(String[] args) {
        //System.out.println("frequencyOfChars(\"AABBCDD\") = " + frequencyOfChars("AAABBCDD"));

        System.out.println("output: " + maxCommentChar("amazon is amazing"));

    }

    public static String maxCommentChar(String str) {

        List<String> chList=new LinkedList<>(Arrays.asList(str.toLowerCase().split("")));
        int count=0;
        for (int i = 0; i <chList.size() ; i++) {
          //count=(int)chList.stream().filter(p->p.equals(chList.get(i))).count();
        }
        int ch=(int)chList.stream().filter(p->p.equals("a")).count();
        System.out.println(ch);

//        Set<String>nonDup=new LinkedHashSet<>(chList);
//        String result="";
//
//        for (int i = 0; i <nonDup.size() ; i++) {
//            int count=0;
//            int index=0;
//            for (String each:chList){
//                if(each.equals(chList.get(index++))){
//                    count++;
//                }
//            }
//            int max=0;
//            if(max<count){
//                max=count;
//            }
//            if(max==count){
//                result=chList.get(i);
//                System.out.println(max);
//            }
//
//
//        }

        return "";
    }

}
