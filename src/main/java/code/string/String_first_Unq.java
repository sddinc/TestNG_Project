package code.string;

/*
Given a string find first non_repeating charater, return null if there are no non-repeating chars


 */
public class String_first_Unq {
    public static void main(String[] args) {
        String str = "Jccgavabjavvbav";

        System.out.println("firstNonRepeating(str) = " + firstNonRepeating(str));
    }


    public static Character firstNonRepeating(String str) {//=java
        str = str.toLowerCase();
        String result = "";
        for (int k = 0; k < str.length(); k++) {

            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(k)) {
                    count++;
                }
            }
            if (count == 1) {
                result+= str.charAt(k) + "";

            }

        }
        return (!result.isEmpty()) ? result.charAt(0) : null;

    }

}
