package utilities.wrappers.domain;

public class AgeParser {
    public static Integer parse(String text) {
        if (text.length() == 0) {
            return null;
        }

        return Integer.valueOf(text);
    }

    public static boolean sameAge(Integer a, Integer b) {
        if (a == null || b == null) {
            return false;
        }
        return a.equals(b);
    }
}
