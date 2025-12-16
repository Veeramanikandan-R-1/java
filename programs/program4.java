// palindrome

package programs;

public class Main {

    public static String revereString(String inpStr) {
        String reverseString = "";
        for (int i = inpStr.length() - 1; i >= 0; i--) {
            reverseString += inpStr.charAt(i);
        }
        return reverseString;
    }

    public static boolean checkPanlindrome(Object n) {
        if (n instanceof String) {
            String original = (String) n;
            String reverseString = revereString(original);
            return original.equalsIgnoreCase(reverseString);
        } else if ((n instanceof Integer)) {
            String original = String.valueOf(n);

            String reverseString = revereString(original);
            return original.equals(reverseString);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Integer inputNo = 121;
        boolean result = checkPanlindrome(inputNo);
        boolean result1 = checkPanlindrome("madam");
        System.out.println("result " + result);
        System.out.println("result1 " + result1);
    }
}
