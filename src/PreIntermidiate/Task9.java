package PreIntermidiate;

/**
 * Created by George on 15.03.2016.
 */
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("please enter number: ");
        int inputNumber = in.nextInt();
        if (inputNumber > 1) {
            for (int i = 2; i <= 9; i++) {
                int multiplicationRezult = inputNumber * i;
                System.out.println(inputNumber + "*" + i + " = " + multiplicationRezult);
            }
        }
    }
}