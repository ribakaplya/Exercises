//2520 - самое маленькое число, которое делится без остатка на все числа от 1 до 10.
//Какое самое маленькое число делится нацело на все числа от 1 до 20?
//Ответ: 232792560

package ProjectEuler;

import java.util.ArrayList;

public class Problem05 {
    public static void main(String[] args) {
        ArrayList<Integer> multipliers = new ArrayList<>(20);
        multipliers.add(2);
        for (int i = 3; i < 21; i++) {
            int num = i;
            for (Integer multiplier : multipliers) {
                if (num % multiplier == 0) {
                    num /= multiplier;
                }
            }
            if (num > 1) {
                multipliers.add(num);
            }
        }
        int result = 1;
        for (Integer multiplier : multipliers) {
            result *= multiplier;
        }
        System.out.println(result);
    }
}
