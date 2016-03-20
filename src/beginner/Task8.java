package beginner;

/**
 * Created by George on 11.03.2016.
 */
public class Task8 {
    public static void main(String[] args) {
        String a = "HelloWorld";
        int n ;
        myMethod(a,9);
    }

    public static void myMethod(String value, int lenth){
        for (int n = 0; n < lenth ; n++){

            System.out.println(value.substring(0,lenth - n));

        }

    }
}
