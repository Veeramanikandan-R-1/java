// **Find Frequency of Characters in a String**
//    👉 Use a `HashMap<Character, Integer>

package programs;

import java.util.HashMap;

public class Main {

    public static Object findOccurences(String inputStr) {
        var resultMap = new HashMap<Character, Integer>();
        for (int i = 0; i < inputStr.length(); i++) {
            char letter = inputStr.charAt(i);
            if (resultMap.containsKey(letter)) {
                resultMap.put(letter, resultMap.get(letter) + 1);
            } else {
                resultMap.put(letter, 1);
            }
        }
        return resultMap;
    }

    public static void main(String[] args) {
        Object result = findOccurences("manikandan");
        System.out.println("resultMap" + result);
    }
}