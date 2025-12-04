class Solution {
    public boolean isAnagram(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            char letterToFind = s.charAt(i);
            System.out.println(letterToFind);
            int indexFound = t.indexOf(letterToFind);
            if (indexFound == -1) {
                return false;
            }
            System.out.println("indexFound " + indexFound);
            t = t.substring(0, indexFound) + t.substring(indexFound + 1);
            System.out.println("new substring " + t);
        }
        return t.length() == 0;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution solObj = new Solution();
        boolean result = solObj.isAnagram("rat", "car");
        System.out.println(result);
    }
}