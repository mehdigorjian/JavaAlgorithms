import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter an integer: ");
            int num = sc.nextInt();
            int sum = 0;
            int temp = num;
            while (temp > 0) {
                int reminder = temp % 10;
                temp = temp / 10;
                sum = sum + reminder * reminder * reminder;
            }
            if (sum == num)
                System.out.println("It is an Armstrong number!");
            else
                System.out.println("It is NOT an Armstrong number!");
        }
    }
}