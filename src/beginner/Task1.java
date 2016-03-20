package beginner;

/**
 * Created by George on 06.03.2016.
 */
public class Task1 {
    public static void main(String[] args) {

        int in [] = {1, 2, 3, 6};
        int[] result = multipleByThree(in);

    }



    public static int [] multipleByThree(int[] in){
        for (int i = 0; i < in.length; i++) {
            in[i] = in[i] * 3;
            System.out.println(in[i]);
        }
//        in[0] = in [0] * 3;
        return in;

    }

}
