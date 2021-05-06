package code.array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/*1. Implement a program of  O(N^2) runtime complexity of the above duplicate checker.
        You will implement a duplicate checker from a given list of words.

        Input: ['homework', 'assignment', 'quiz', 'discussion', 'quiz', 'program']

        Output: Yes, there is a duplicate. [e.g. 'quiz']
        */
public class StringArrayElementCount {
    public static void main(String[] args) {
        String[] srtArray = {"homework", "assignment", "quiz", "discussion", "quiz", "program", "program"};
        System.out.println( elementCountInString(srtArray));
    }
    public static String elementCountInString(String[] srtArray) {
        String result = "";
        Set<String> nonDub = new LinkedHashSet<>(Arrays.asList(srtArray));
        int []arrCount=new int[nonDub.size()];
        for (int k = 0; k < srtArray.length; k++) {
            int count = 0;
            for (int i = 0; i < srtArray.length; i++) {
                if (srtArray[i].equals(srtArray[k])) {
                    count++;
                }
            }
            if (!result.contains(srtArray[k])) {
                result += srtArray[k]+" element count: "+count+"\n";
            }
        }
        return result;
    }
}