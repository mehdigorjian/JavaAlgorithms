import java.util.Scanner;

public class NumberInWords {
    public static int reverse(int numInput) {
        int temp = numInput;
        int rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter an integer: ");
            int num = sc.nextInt();
            // System.out.println(reverse(num));
            int revNum = reverse(num);
            int temp = revNum;
            while (temp > 0) {
                int remind = temp % 10;
                switch (remind) {
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                }
                temp /= 10;
            }
        }
        System.out.println("");
    }
}
