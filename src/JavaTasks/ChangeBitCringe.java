//Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное.
//Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).

package JavaTasks;

import static java.lang.Math.pow;

public class ChangeBitCringe {
    public static int flipBit(int value, int bitIndex) {
        StringBuilder binaryValue = new StringBuilder();
        binaryValue.append(Integer.toBinaryString(value));

        int binaryIndex = binaryValue.length() - bitIndex;
        if (binaryIndex < 0) {
            int amountOfZeros = binaryIndex * (-1) - 1;
            binaryValue.insert(0, "1" + "0".repeat(amountOfZeros));
        } else {
            char valueOfBinaryIndex = binaryValue.charAt(binaryIndex);

            int newValueOfBinaryIndex;
            if (valueOfBinaryIndex == 49) { //char 49 → int 1
                newValueOfBinaryIndex = 0;
            } else {
                newValueOfBinaryIndex = 1;
            }
            binaryValue.deleteCharAt(binaryIndex);
            binaryValue.insert(binaryIndex, newValueOfBinaryIndex);
        }
        int result = 0;
        for (int index = binaryValue.length() - 1, degreeOfNumber = 0; index > -1; index--, degreeOfNumber++) {
            int p = (int) binaryValue.charAt(index) - 48;
            if (p > 0) {
                result += pow(2, degreeOfNumber);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(flipBit(13, 5));
    }
}
