import java.util.HashMap;

public class Day9_ValidAnagram {

    public static void main(String[] args) {

        String s = "anagram";   
        String t = "nagaram";

        if (s.length() != t.length()) {
            System.out.println("Not an Anagram");
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) {
                System.out.println("Not an Anagram");
                return;
            }

            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) {
                map.remove(c);
            }
        }

        System.out.println(map.isEmpty() ? "Anagram" : "Not an Anagram");
    }
}
