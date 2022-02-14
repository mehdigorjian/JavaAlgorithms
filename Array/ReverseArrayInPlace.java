public class ReverseArrayInPlace {
    // 1ST SOLUTION
    public static int[] reverse(int[] arr) {
        for (int i = 0; i <= arr.length / 2; i++) {
            // int temp = arr[i];
            // arr[i] = arr[arr.length - 1 - i];
            // arr[arr.length - 1 - i] = temp;

            swap(arr, i);
        }
        return arr;
    }

    private static void swap(int[] nums, int ind1) {
        int temp = nums[ind1];
        nums[ind1] = nums[nums.length - 1 - ind1];
        nums[nums.length - 1 - ind1] = temp;
    }

    // 2ND SOLUTION
    public static int[] reverse2(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            swap2(arr, low, high);
            low++;
            high--;
        }
        return arr;
    }

    private static void swap2(int[] nums, int ind1, int ind2) {
        int temp = nums[ind1];
        nums[ind1] = nums[ind2];
        nums[ind2] = temp;
    }

    public static void main(String[] args) {

        int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        for (int item : reverse2(a))
            System.out.println(item);
    }
}