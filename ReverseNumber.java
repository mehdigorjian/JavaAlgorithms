import java.util.Scanner;

public class ReverseNumber {
    public static int reverse(int num) {
        int hold = num;
        int temp = 0;

        while (hold > 0) {
            temp = temp * 10 + hold % 10;
            hold = hold / 10;
        }
        return temp;
    }

    public static boolean isPalindrome(int pal) {
        if (pal == reverse(pal))
            return true;
        return false;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter an Integer: ");
            int num = sc.nextInt();
            System.out.println(reverse(num));
            System.out.println(isPalindrome(num));
        }
    }
}
