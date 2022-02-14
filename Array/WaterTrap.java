class SovleWaterTrap {
    private int[] height;

    public SovleWaterTrap(int[] height) {
        this.height = height;
    }

    public int solve() {
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        leftMax[0] = rightMax[height.length - 1] = 0;

        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i - 1]);
        }
        for (int j = height.length - 2; j >= 0; j--) {
            rightMax[j] = Math.max(rightMax[j + 1], height[j + 1]);
        }

        int sum = 0;
        for (int k = 1; k < height.length - 1; k++) {
            if (Math.min(leftMax[k], rightMax[k]) > height[k])
                sum += Math.min(leftMax[k], rightMax[k]) - height[k];
        }
        return sum;
    }
}

public class WaterTrap {
    public static void main(String[] args) {
        // int[] array = new int[] { 2, 1, 3, 1, 4 };
        int[] array = new int[] { 1, 0, 2, 1, 3, 1, 2, 0, 3 };
        SovleWaterTrap st = new SovleWaterTrap(array);
        System.out.println(st.solve());
    }
}