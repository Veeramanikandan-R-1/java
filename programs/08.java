// **Find Maximum and Minimum in Array**

package programs;

import java.util.Arrays;

public class Main {
    public static int[] findMinMax(int[] n) {
        int Min = n[0];
        int Max = n[0];
        for (int i = 1; i < n.length; i++) {
            int currValue = n[i];
            if (currValue > Max) {
                Max = currValue;
            }
            if (currValue < Min) {
                Min = currValue;
            }
        }
        return new int[] { Min, Max };
    }

    public static void main(String[] args) {
        int[] inputArr = { 2, 4, 1, 7, 8 };
        int[] result = findMinMax(inputArr);
        System.out.println("result " + Arrays.toString(result));
    }
}
