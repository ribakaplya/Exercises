//Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное.
//Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).

package JavaTasks;

import static java.lang.Math.pow;

public class ChangeBit {
    public static int flipBit(int value, int bitIndex) {
        int binaryPerformBitIndex = (int) pow(2, bitIndex - 1);
        return value ^ binaryPerformBitIndex;
    }
    public static void main(String[] args) {
        System.out.println(flipBit(13, 5));
    }
}
