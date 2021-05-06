package code.string;
/*
4. Find out how many alpha characters
 are present in a string? Find the number of words in string?
 */
public class findCharacter {

    public static void main(String[] args) {
        String str="Number of alpha character";
        str="selcuk";
        findWord(str);

        findCharacter(str);
        findABC("Hih9898jhjh%%^$%^ oio ");


    }
    public static void findWord(String str){
        String []arrStr=str.split(" ");

        System.out.println("number of word: " + arrStr.length);
    }

     public static void findCharacter(String str){
        str=str.replaceAll(" ","");


        System.out.println("number of character: " + str.length());
    }
     public static void findABC(String str){
        String alb="";
        str=str.replaceAll(" ","");
        char []ch=str.toCharArray();

         for (int i = 0; i <ch.length ; i++) {
             if(Character.isAlphabetic(ch[i])){
                 alb+=ch[i]+"";
             }
         }
         System.out.println("alb = " + alb+"\n number of abc...: "+alb.length());



    }




}
