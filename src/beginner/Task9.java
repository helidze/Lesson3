package beginner;

/**
 * Created by George on 11.03.2016.
 */
public class Task9 {
    public static void main(String[] args) {
        double a = 12;
        double b = 4;
        double sum = a / b;
        int sumI = (int) (a/b);
        if ((sum - sumI) > 0 ) {
            System.out.println(sum);
        } else
            System.out.println(sumI);
    }
}