package code.string;

public class RepeatFirst {


    public static char repeatFirst(String text) {
        char ch[] = text.toCharArray();
        String result="";

        for (int k = 0; k <ch.length ; k++) {

            int count = 0;
            for (int i = 0; i < ch.length; i++) {
             if(ch[k]==ch[i]){
                 count++;
             }
            }
            if(count>1){
                result+=""+ch[k];
            }

        }
        System.out.println("result = " + result);
        return (result.length()>1)?result.charAt(0):'a';

    }

    public static void main(String[] args) {
        String text="Try your best";
        System.out.println(repeatFirst(text));

    }
}
