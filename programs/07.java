// Sum of Digits in a Number

package programs;

public class Main {
    public static int findDigitsSum(int n) {
        int sum = 0;
        String noOfString = String.valueOf(n);
        for (int i = 0; i < noOfString.length(); i++) {
            sum = sum + Character.getNumericValue(noOfString.charAt(i));
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = findDigitsSum(123);
        System.out.println("result " + result);
    }
}
