package beginner;

/**
 * Created by George on 06.03.2016.
 */
public class Task5 {
    public static void main(String[] args) {

        int mark = 3;
        int result = showMarks(mark);
        System.out.println(result);

    }
    public static int  showMarks(int b) {
        switch (b) {
            case 1:
                System.out.println("Execellent");
                break;
            case 2:
                System.out.println("Good");
                break;
            case 3:
                System.out.println("Normal");
                break;
            case 4:
                System.out.println("Bad");
                break;
            case 5:
                System.out.println("Worst");
                break;

        }
        return b;
    }
}

