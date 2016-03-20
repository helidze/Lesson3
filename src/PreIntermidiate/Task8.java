package PreIntermidiate;

/**
 * Created by George on 11.03.2016.
 */
public class Task8 {
    public static void main(String[] args) {
        int n = 100;
        int a = 1, b = 1;
        System.out.print(a + " " + b);
        int fib = 2, i = 2;
        while (i < n) {
            fib = a + b;
            a = b;
            b = fib;
            if (fib % 2 != 0) {
                System.out.print(" " + fib);
            }
            i++;

        }
    }
}


