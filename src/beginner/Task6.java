package beginner;

/**
 * Created by George on 06.03.2016.
 */
public class Task6 {
    public static void main(String[] args) {

        int [] in = new int [26];
        int[] result = evenNumber(in);

    }



    public static int [] evenNumber(int[] in){
        for (int i = 0; i < in.length; i++) {
            in [i] = i*2;
            System.out.print(in[i] + " ");
        }
        return in;

    }

}