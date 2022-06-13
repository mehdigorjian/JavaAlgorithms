public class DotArgs {
    public int sum(String st, int... arr) {
        int s = 0;
        for (int i : arr) {
            s += i;
        }
        System.out.println(st);
        return s;

    }

    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
        DotArgs ar = new DotArgs();
        Integer sumCount = (Integer) 0;
        System.out.println(ar.sum("Hi", a));
        for (String s : args) {
            if (s.matches("[0-9\\.]+"))
                sumCount += Integer.parseInt(s);
        }
        System.out.println(sumCount);
    }
}