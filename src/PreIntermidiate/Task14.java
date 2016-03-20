package PreIntermidiate;

/**
 * Created by George on 20.03.2016.
 */
public class Task14 {
    public static void main(String[] args) {
        String test = "SomeString";
        printDiagonal(test);
    }

    static void printDiagonal(String s) {
        String blank = "";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(blank + s.charAt(i));
            blank = blank + " ";
        }

    }
}
