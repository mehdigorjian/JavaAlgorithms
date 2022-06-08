public class ArraySecondMaxElement {
    public static int find(int num) {
        int[] a = { 9, 6, 8, 7, 4, 5, 3, 2, 1 };
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static int secondMax(int[] arr) {
        int max = arr[0];
        int secMax = (int) Double.NEGATIVE_INFINITY;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax) {
                secMax = arr[i];
            }
        }
        return secMax;
    }

    public static void main(String[] args) {
        // System.out.println(find(10));
        int[] a = { 20, 21, 9, 6, 8, 11, 7, 4, 5, 18, 3, 2, 1, 19, 22 };
        System.out.println(secondMax(a));
    }
}
