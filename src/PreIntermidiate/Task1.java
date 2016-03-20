package PreIntermidiate;

/**
 * Created by George on 11.03.2016.
 */
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        boolean sheSmile;
        boolean heSmile;
        Scanner in = new Scanner(System.in);
        System.out.print("sheSmile: ");
        sheSmile = in.nextBoolean();
        System.out.print("heSmile: ");
        heSmile = in.nextBoolean();
        if (sheSmile == heSmile){
            System.out.println("visit Cinema: true");
        } else
            System.out.println("visit Cinema: false");

    }
}
