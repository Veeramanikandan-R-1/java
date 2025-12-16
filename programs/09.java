// **Remove Duplicates from Array**

package programs;

import java.util.Arrays;

public class Main {
    public static boolean checkIfValueExists(Object[] arr, Object value) {
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] != null) && (arr[i].equals(value))) {
                return true;
            }
        }
        return false;
    }

    public static Object[] removeDuplicates(Object[] n) {
        Object[] outputArr = new Object[0];

        for (int i = 0; i < n.length; i++) {
            if (!checkIfValueExists(outputArr, n[i])) {
                Object[] newArr = Arrays.copyOf(outputArr, outputArr.length + 1);
                newArr[outputArr.length] = n[i];
                outputArr = newArr;
            }
        }
        return outputArr;
    }

    public static void main(String[] args) {
        Object[] inputArr = { 2, 4, 1, 1, 7, 8 };
        Object[] result = removeDuplicates(inputArr);
        System.out.println("result " + Arrays.toString(result));
    }
}
