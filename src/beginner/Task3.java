package beginner;

/**
 * Created by George on 06.03.2016.
 */
public class Task3 {
    public static void main(String[] args) {
        int x = 14;
        boolean result = method(x);
        System.out.println(result);
    }
    public static boolean method (int a) {
        if (a < 0) {
            System.out.println("a < 0");
            return false;
        } else if (a % 3 == 0 || a % 5 == 0 ) {
            System.out.println("a % 3 == 0 or a % 5 == 0 = true");
            return true;
        }
        return false;
    }

}
