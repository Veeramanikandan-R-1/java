// Find Largest of Three Numbers

package programs;

public class Main {
    public static int findLargest(int[] n) {
        int largest = n[0];
        for (int i = 0; i < n.length; i++) {
            if (i == 0)
                continue;
            if (n[i] > largest) {
                largest = n[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] inputArr = { 1, 12, 3 };
        int result = findLargest(inputArr);
        System.out.println("largest " + result);
    }
}
