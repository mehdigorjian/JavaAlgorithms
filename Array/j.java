import java.io.UnsupportedEncodingException;

public class j {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // String str = "\u1F60A";
        // byte[] b = str.getBytes("UTF-8");
        // System.out.println(new String(b, "UTF-8"));
        // String iran = "\ud83c\uddee\ud83c\uddf7"; // Flag for Iran
        // String us = "\ud83c\uddfa\ud83c\uddf8"; // Flag for United States
        // System.out.println(us);
        String emoji = "\ud83d\ude18"; // Face Throwing a Kiss
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " " + emoji + " ");
        }
    }
}