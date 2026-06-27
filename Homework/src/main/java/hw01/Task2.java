package hw01;

public class Task2 {
    public static int[] arrayMerge(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;
        int[] result = new int[m + n];
        int k=0;
        for (int i = 0; i < m; i++) {
            result[k] = a[i];
            k++;
        }
        for(int j=0;j<n;j++) {
            result[k] = b[j];
            k++;
        }
        return result;
    }
}
