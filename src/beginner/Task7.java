package beginner;

/**
 * Created by George on 07.03.2016.
 */
public class Task7{
    public static void main(String [] args){

        int [] in = {1, 15, 17, 2, 52, 103, 12};

        for(int i = 0; i< in.length; i++)
            System.out.print(in [i] + "  ");

        int max = in[0];

        for(int i = 0; i< in.length; i++)
        {
            if(max < in[i])
                max = in[i];

        }
        System.out.println("\n Maximum = " + max);
    }
}
