// factorial

package programs;

public class Main {
    public static int findFactorial(int n) {
        int factorial = 1;
        while (n > 0) {
            factorial = factorial * n;
            n--;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int result = findFactorial(5);
        System.out.println("result " + result);
    }
}
