import java.util.HashMap;

public class Anagram {
    private static boolean isAnagram(String s1, String s2) {
        s1 = s1.replace(" ", "").toLowerCase();
        s2 = s2.replace(" ", "").toLowerCase();

        if (s1.length() != s2.length())
            return false;

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            Character ch = s1.charAt(i);
            if (hm.containsKey(ch)) {
                Integer val = hm.get(ch);
                hm.replace(ch, ++val);
            } else
                hm.put(ch, 1);

        }
        for (int j = 0; j < s2.length(); j++) {
            Character ch2 = s2.charAt(j);
            if (hm.containsKey(ch2)) {
                Integer val2 = hm.get(ch2);
                hm.replace(ch2, --val2);
            } else
                hm.put(ch2, 1);
        }
        // Collection<Integer> c = hm.values();
        for (Integer in : hm.values()) {
            if (in != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // System.out.println(isAnagram("abcdefX", "cbafxed"));
        System.out.println(isAnagram("abcdeff", "cbaJfed"));
    }
}
