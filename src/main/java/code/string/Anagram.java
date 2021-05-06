package code.string;

public class Anagram {

    public static boolean isAnagram(String a, String b) {

        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();

        int aCount = 0;
        int bCount = 0;
        for (char value : aChar) {
            aCount += value;
        }

        for (char c : bChar) {
            bCount += c;
        }

        return aCount == bCount;

    }

    public static void main(String[] args) {
        String a = "cinema";
        String b = "iceman";
        System.out.println("isAnagram(a,b) = " + isAnagram(a, b));
    }
}
