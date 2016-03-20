package PreIntermidiate;

/**
 * Created by George on 11.03.2016.
 */
public class Task7 {
    public static void main(String[] args) {

    int [] array = {12,1,5,7,13,-1,115};

    int max = array[0], min = array[0];

    for(int i = 0; i<array.length; i++){
        if(max<array[i])
            max = array[i];
        if(min>array[i])
            min = array[i];
    }
    System.out.println("Max * 2: "+max*2);
    System.out.println("Min * 2: "+min*2);
}
}
