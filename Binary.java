public class Binary {
    public static void main(String[] args) {
        int b = 110001;
        String bs = String.valueOf(b);
        System.out.println(bs.matches("\\d[01]+"));

        String h = "12A8";
        System.out.println(h.matches("[0-9A-F]+"));

        String date = "01/10/2020";
        System.out.println(date.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));

        String a = "a!b@cde#";
        System.out.println(a.replaceAll("\\W", ""));

        String c = "abc     def          ghi   ";
        System.out.println(c.replaceAll("\\s+", " "));
    }
}
