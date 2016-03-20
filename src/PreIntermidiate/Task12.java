package PreIntermidiate;

/**
 * Created by George on 20.03.2016.
 */
public class Task12 {

    public static void main(String[] args) {
        int number = 12345;
        String s = String.valueOf(number);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = Integer.parseInt(Character.toString(s.charAt(i)));
            result = result + temp;
        }
        System.out.println(result);
    }

    static void mathMethod(int a) {
        int temp = 1;
        for (int i = 0; temp == 0 ; i ++) {
            temp = a % 10;
        }
    }
}
