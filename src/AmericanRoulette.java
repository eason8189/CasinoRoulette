import java.util.Arrays;
import java.util.Random;

/**
 * Created by Racoonsy on 15-02-04.
 */
public class AmericanRoulette extends Roulette {

    public static int[] numbers = new int[38];
    private static int result;

    public AmericanRoulette() {
        numbers[0] = 0;
        numbers[1] = 28;
        numbers[2] = 9;
        numbers[3] = 26;
        numbers[4] = 30;
        numbers[5] = 11;
        numbers[6] = 7;
        numbers[7] = 20;
        numbers[8] = 32;
        numbers[9] = 17;
        numbers[10] = 5;
        numbers[11] = 22;
        numbers[12] = 34;
        numbers[13] = 15;
        numbers[14] = 3;
        numbers[15] = 24;
        numbers[16] = 36;
        numbers[17] = 13;
        numbers[18] = 1;
        numbers[19] = 00;
        numbers[20] = 27;
        numbers[21] = 10;
        numbers[22] = 25;
        numbers[23] = 29;
        numbers[24] = 12;
        numbers[25] = 8;
        numbers[26] = 19;
        numbers[27] = 31;
        numbers[28] = 18;
        numbers[29] = 6;
        numbers[30] = 21;
        numbers[31] = 33;
        numbers[32] = 16;
        numbers[33] = 4;
        numbers[34] = 23;
        numbers[35] = 35;
        numbers[36] = 14;
        numbers[37] = 2;
    }

    public static void setWinningNumber() {
        int index = new Random().nextInt(38);
        result = numbers[index];
    }

    public static int getWinningNumber(){
        return result;
    }

    public String toString() {
        return "Ethan's American roulette v1.0 Feb 13 2015\n" +
                "Wheel: " + Arrays.toString(numbers);
    }
}