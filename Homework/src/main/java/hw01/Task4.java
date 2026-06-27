package hw01;

public class Task4 {
    public static void Compute() {
        double sum = 0;
        for (double i = 1; i <= 97; i = i + 2) {
            sum = sum + i / (i + 2);
        }
        System.out.println(sum);
    }
}
