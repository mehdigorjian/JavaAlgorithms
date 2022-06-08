public class StringTest {
    public static void main(String[] args) {
        String str = "mehdi@gmail.com";
        int atIndex = str.indexOf("@");
        int lastDotIndex = str.lastIndexOf(".");
        String domain = str.substring(atIndex + 1, lastDotIndex);
        String username = str.substring(0, atIndex);
        System.out.println(username);
        System.out.println(domain);
        System.out.println(username.matches("[a-z]*"));
        System.out.println(domain.matches("gmail"));
        System.out.println(domain.equals("mail"));
    }
}