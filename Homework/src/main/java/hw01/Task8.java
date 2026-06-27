package hw01;

public class Task8 {
    public static void GetNarcissus() {
        for (int i = 100; i < 1000; i++) {
            int a = i % 100;
            int b = (i - a) % 10;
            int c = i/100;
            int sum = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
            if (sum == i) {
                System.out.println(i);
                System.out.println(String.format("i=%d,a=%d,b=%d,c=%d",i,a,b,c));
            }
            else{
                //System.out.println(String.format("i=%d,a=%d,b=%d,c=%d",i,a,b,c));
            }
        }
    }
}
