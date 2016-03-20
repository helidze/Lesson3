package PreIntermidiate;

/**
 * Created by George on 11.03.2016.
 */
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {

        int a;
        int b;
        Scanner in = new Scanner(System.in);
        System.out.print("a: ");
        a = in.nextInt();
        System.out.print("b: ");
        b = in.nextInt();
        if (a == b || (a+b)== 21 )
            System.out.println("true");
        else
            System.out.println("false");

    }
}
