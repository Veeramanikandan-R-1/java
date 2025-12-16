// Reverse a Number

package programs;

public class Main {
    public static int reverseNumber(int n) {
        String noAsString = String.valueOf(n);
        String reverseString = "";
        for (int i = noAsString.length() - 1; i >= 0; i--) {
            reverseString += noAsString.charAt(i);
        }
        return Integer.parseInt(reverseString);
    }

    public static void main(String[] args) {
        int inputNo = 1234;
        int result = reverseNumber(inputNo);
        System.out.println("largest " + result);
    }
}
