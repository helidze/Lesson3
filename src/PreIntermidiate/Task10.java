package PreIntermidiate;

import java.util.Arrays;

/**
 * Created by George on 15.03.2016.
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println("starting");
        String a = "731671765313306249192251196744265747423553491949349698352031277450632623957831" +
                "801698480186947885184385861560789112949495459501737958331952853208805511125406" +
                "987471585238630507156932909632952274430435576689664895044524452316173185640309" +
                "871112172238311362229893423380308135336276614282806444486645238749303589072962" +
                "904915604407723907138105158593079608667017242712188399879790879227492190169972" +
                "088809377665727333001053367881220235421809751254540594752243525849077116705560" +
                "136048395864467063244157221553975369781797784617406495514929086256932197846862" +
                "248283972241375657056057490261407972968652414535100474821663704844031998900088" +
                "952434506585412275886668811642717147992444292823086346567481391912316282458617" +
                "866458359124566529476545682848912883142607690042242190226710556263211111093705" +
                "442175069416589604080719840385096245544436298123098787992724428490918884580156" +
                "166097919133875499200524063689912560717606058861164671094050775410022569831552" +
                "0005593572972571636269561882670428252483600823257530420752963450";
//        try {
//            int number = Integer.parseInt(a);
//
//        } catch (NumberFormatException e) {
//            return;
//        }
        //String aa = "127773342";
        int result = 1;
        int biggest = 0;
        int [] tempNumbers = new int[9];
        int [] biggestNumbers = null;
        //по всем символам строки
        for (int i = 0; i < a.length() - 1; i++) {
            //
            for (int ii = i; ii < i + 9 && i + 9 <= a.length(); ii++) {
                int soughtFor = Integer.parseInt(Character.toString(a.charAt(ii)));
                tempNumbers[ii - i] = soughtFor;
                result = result * soughtFor;
            }
            if (result > biggest) {
                biggestNumbers = Arrays.copyOf(tempNumbers, tempNumbers.length);
                biggest = result;
            }
            result = 1;

        }
        System.out.println(biggest);
        for (int i : biggestNumbers) {
            System.out.print(i  + " ");
        }
        // 1 2 3
    }

}
