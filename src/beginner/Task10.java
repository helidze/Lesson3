package beginner;

/**
 * Created by George on 11.03.2016.
 */
public class Task10 {
    public static void main(String[] args) {

        int n = 9;

        String message = "";
        for(int i = 0;i < n;i++){
            if (i< (n/2 + 1)) {
                message = message + "*";
            } else {
                message = message.substring(1,message.length());
            }

            System.out.println(message);
        }
    }
}