package beginner;

/**
 * Created by George on 06.03.2016.
 */
public class Task2 {

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        boolean result = method(x, y);
        System.out.println(result);
    }
    public static boolean method (int a, int b) {
        if (a == 10 || b == 10) {
            System.out.println("a || b == 10");
            return true;
        } else if (a + b == 10) {
            System.out.println("a + b = true");
            return true;
        }
        return false;
    }

}
