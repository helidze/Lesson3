package PreIntermidiate;

/**
 * Created by George on 11.03.2016.
 */
public class Task6 {
    public static void main(String[] args) {
        testArray();
    }
    public static void testArray() {
        double myArray[] = {3,5,7,12};
        double sum=0;
        for(int i=0; i<myArray.length; i++) {
            sum=sum+myArray[i];
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее арифметическое: " + sum/myArray.length);
    }
}
