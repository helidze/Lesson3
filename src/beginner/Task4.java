package beginner;

/**
 * Created by George on 06.03.2016.
 */
public class Task4 {
    public static void main(String[] args) {

        int in [] = {1, 2, 3, 1};
        int result = multipleByThree(in,1);
        System.out.println(result);

    }

    public static int multipleByThree(int[] in, int searchNumber ){
        int counter = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] == searchNumber) {
                counter++;
            }
        }
        return counter;

    }
}
