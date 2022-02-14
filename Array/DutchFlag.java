import java.util.Arrays;

class Flag {
    private int[] arr;

    public Flag(int[] arr) {
        this.arr = arr;
    }

    public int[] sort() {
        int i = 0, j = 0, k = arr.length - 1;
        int pivot = 1;
        while (j <= k) {
            if (arr[j] < pivot) {
                swapArrayElementByIndex(i, j);
                i++;
                j++;
            } else if (arr[j] > pivot) {
                swapArrayElementByIndex(j, k);
                k--;
            } else {
                j++;
            }
        }
        return arr;
    }

    private void swapArrayElementByIndex(int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void display() {
        System.out.println(Arrays.toString(arr));
    }
}

public class DutchFlag {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 0, 0, 2, 1, 1, 2, 0, 2 };
        Flag df = new Flag(array);
        df.sort();
        df.display();
    }
}
