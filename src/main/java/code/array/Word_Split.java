package code.array;

public class Word_Split {



    /*
Word Split
Have the function WordSplit(strArr) read the array of strings stored in strArr,
which will contain 2 elements: the first element will be a sequence of characters,
and the second element will be a long string of comma-separated words, in alphabetical order,
 that represents a dictionary of some arbitrary length.
  For example: strArr can be: ["hellocat", "apple,bat,cat,goodbye,hello,yellow,why"].
  Your goal is to determine if the first element in the input can be split into two words,
  where both words exist in the dictionary that is provided in the second input. In this example,
  the first element can be split into two words: hello and cat because both of those words are in the dictionary.

Your program should return the two words that exist in the dictionary separated by a comma. So for the example above,
your program should return hello,cat. There will only be one correct way to split the first element of characters into two words.
If there is no way to split string into two words that exist in the dictionary, return the string not possible.
The first element itself will never exist in the dictionary as a real word.
Examples
Input: new String[] {"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"}
Output: base,ball
Input: new String[] {"abcgefd", "a,ab,abc,abcg,b,c,dog,e,efd,zzzz"}
Output: abcg,efd
Browse Resources
Search for any help or documentation you might need for this problem. For example: array indexing, Ruby hash tables, etc.
*/

    public static String wordSplit(String [] strArr){
        String wordMain = strArr[0]; // baseball
        String stringDictionary = strArr[1]; //
        String[] arrayDictionary = stringDictionary.split(",");// a all bal
        String result = "";

        String firstWord = "";
        String word="";
        String left="";

        //baseball
        for (int i = 0; i < arrayDictionary.length; i++) {
            if (wordMain.startsWith(arrayDictionary[i])) {
                word = arrayDictionary[i];//b
                left=wordMain.substring(word.length());
                for (int k = 0; k <arrayDictionary.length; k++) {
                    if(arrayDictionary[k].equals(left)){
                        firstWord=word;
                    }
                }
            }
        }
        if(firstWord.length()>0&&left.length()>0){
            result=firstWord+", "+left;
        }else {
            result="Not Possible";
        }
        return result;
    }
    public static void main(String[] args) {

        String[] strArr = {"selcukdemirci", "demirci,a,sel,cuk,ci,demir,all,b,selcuk,bas,base,cat,d,e,quit,z"};

        System.out.println(wordSplit(strArr));

    }


}

