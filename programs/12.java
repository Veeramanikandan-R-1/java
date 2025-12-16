// **Reverse Words in a Sentence**

package programs;

import java.util.Arrays;

public class Main {

    public static void reverseWordInString(String inputString) {
        String[] inputAfterSpilt = inputString.split(" ");
        System.out.println(Arrays.toString(inputAfterSpilt));
        String outpuString = "";
        for (int j = inputAfterSpilt.length - 1; j >= 0; j--) {
            System.out.println(inputAfterSpilt[j]);
            outpuString = outpuString + " " + inputAfterSpilt[j];
        }
        System.out.println("outpuString " + outpuString);
    }

    public static void main(String[] args) {
        String inputArr = "Java is fun";
        reverseWordInString(inputArr);
    }
}