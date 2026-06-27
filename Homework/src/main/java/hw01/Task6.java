package hw01;

public class Task6 {
    public static String toBinary(int value) {
        StringBuilder sb = new StringBuilder();
        int temp = value;
        while (temp != 0) {
            int yushu = temp % 2;
            sb.append(yushu);
            temp = temp / 2;
        }
        sb.reverse();
        return sb.toString();
    }
}
