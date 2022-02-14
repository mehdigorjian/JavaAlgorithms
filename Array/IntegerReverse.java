public class IntegerReverse {
    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev; // to be changed
    }

    public static void main(String[] args) {
        System.out.println(reverse(12309));
    }
}
