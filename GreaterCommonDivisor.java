import java.util.Scanner;

public class GreaterCommonDivisor {
    public static int gcd1(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

    public static int gcd(int x, int y) {
        int xx = x, yy = y;
        if (xx == yy)
            return xx;
        int max = Math.max(xx, yy);
        int min = Math.min(xx, yy);
        while (min != max || min != 1 || max != 1) {
            int temp = max - min;
            if (temp == min)
                return min;
            else {
                max = Math.max(min, temp);
                min = Math.min(min, temp);
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first integers: ");
            int a = sc.nextInt();
            System.out.print("Enter second integers: ");
            int b = sc.nextInt();
            System.out.println("The GCD is: " + gcd1(a, b));
            // 2448, 4488, gsc = 408
        }
    }
}
