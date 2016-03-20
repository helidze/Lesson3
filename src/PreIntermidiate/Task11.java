package PreIntermidiate;

import java.util.Arrays;

/**
 * Created by George on 19.03.2016.
 */

public class Task11 {
    public static void main(String[] args) {
        int[] arr = {4,6, 0, 1, 2, 3, 1, 9};
        System.out.println(Arrays.toString(arr));
        int[] searchable = {1, 2, 3};
        System.out.println(searchSeq(searchable, arr));
    }
    static boolean searchSeq(int[] searchable, int[] target) {
        for (int i = 0; i < target.length && i + 3 <= target.length; i++) {
            int[] tempArr = Arrays.copyOfRange(target, i, i + 3);
            if (Arrays.equals(searchable, tempArr)) {
                return true;
            }
        }
        return false;
    }
}
