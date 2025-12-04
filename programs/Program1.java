// Sum of N Natural Numbers
// 👉 Use a loop to calculate sum from 1 to n.

package programs;

public class Main {
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = findSum(10);
        System.out.println("result " + result);
    }
}
