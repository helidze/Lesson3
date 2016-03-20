package PreIntermidiate;

/**
 * Created by George on 11.03.2016.
 */
public class Task2 {
    public static void main(String[] args) {
        String originalString = "Cool text";

        char[] c = originalString.toCharArray();

// Replace with a "swap" function, if desired:
        char one = c[0];
        c[0] = c[8];
        c[8] = one;

        String swappedString = new String(c);

        System.out.println(originalString);
        System.out.println(swappedString);
    }


}
