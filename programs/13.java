// **Count Vowels and Consonants in a String**

package programs;

public class Main {

    public static boolean checkIfLetterIsVowel(char letter) {
        String vowels = "aeiou";
        for (int i = 0; i < vowels.length(); i++) {
            if (vowels.charAt(i) == letter) {
                return true;
            }
        }
        return false;
    }

    public static void countVowConst(String inputString) {
        inputString = inputString.toLowerCase();
        int vowelsCount = 0;
        int constCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char letter = inputString.charAt(i);

            if (checkIfLetterIsVowel(letter)) {
                vowelsCount++;
            } else {
                constCount++;
            }

        }
        System.out.println("vowelsCount: " + vowelsCount);
        System.out.println("constCount: " + constCount);
    }

    public static void main(String[] args) {
        String inputStr = "Veeramani";
        countVowConst(inputStr);
    }
}

// Optimized solution

// package programs;

// import java.util.HashSet;
// import java.util.Set;

// public class Main {

// private static final Set<Character> VOWELS = new HashSet<>();

// static {
// VOWELS.add('a');
// VOWELS.add('e');
// VOWELS.add('i');
// VOWELS.add('o');
// VOWELS.add('u');
// }

// public static void countVowConst(String inputString) {
// inputString = inputString.toLowerCase();

// int vowelsCount = 0;
// int constCount = 0;

// for (int i = 0; i < inputString.length(); i++) {
// char ch = inputString.charAt(i);

// if (Character.isLetter(ch)) { // ignore spaces, digits, etc.
// if (VOWELS.contains(ch)) {
// vowelsCount++;
// } else {
// constCount++;
// }
// }
// }

// System.out.println("Vowels: " + vowelsCount);
// System.out.println("Consonants: " + constCount);
// }

// public static void main(String[] args) {
// String inputStr = "Veeramani";
// countVowConst(inputStr);
// }
// }
