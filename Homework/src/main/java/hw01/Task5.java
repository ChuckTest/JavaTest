package hw01;

public class Task5 {
    public static void PrintFibonacci() {
        int[] nums = new int[20];
        nums[0] = 1;
        nums[1] = 1;
        for (int i = 2; i < 20; i++) {
            nums[i] = nums[i - 2] + nums[i - 1];
        }
        for (int j = 0; j < 20; j++) {
            System.out.print(nums[j] + " ");
        }
    }
}
