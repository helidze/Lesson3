package PreIntermidiate;

/**
 * Created by George on 11.03.2016.
 */
public class Task5 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,8,6,4};
        boolean isPresent = false;
        for (int i = 0;i<arr.length;i++) {
            if (arr[i] == 7 || arr[i] == 9)
                isPresent = true;

        }
        if (isPresent) {
            System.out.println("Unlike Numbers");
        } else {
            System.out.println("We don't have unliked numbers ;-)");
        }

    }
}
