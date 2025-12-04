// no of digites

package programs;

public class Main {
    public static int findDigits(int n) {
        String noOfString = String.valueOf(n);
        return noOfString.length();
    }

    public static void main(String[] args) {
        int result = findDigits(5231);
        System.out.println("result " + result);
    }
}
