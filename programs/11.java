// **Find Second Largest Number in an Array**

package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Main {

    public static int[] findSecondLargest(int[] inputArr) {
        for (int i = 0; i < inputArr.length; i++) {
            for (int j = i + 1; j < inputArr.length; j++) {

                if (inputArr[i] > inputArr[j]) {
                    int temp = inputArr[i];
                    inputArr[i] = inputArr[j];
                    inputArr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(inputArr));
        return inputArr;
    }

    public static void main(String[] args) {
        int[] inputArr = { 21, 2, 34, 12, 3 };
        System.out.println("Array: " + Arrays.toString(inputArr));
        findSecondLargest(inputArr);
        // System.out.println("resultMap" + inputArr.getClass().getSimpleName());
    }
}