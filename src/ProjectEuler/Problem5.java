//2520 - самое маленькое число, которое делится без остатка на все числа от 1 до 10.
//Какое самое маленькое число делится нацело на все числа от 1 до 20?
//Ответ: 232792560

package ProjectEuler;

import java.util.ArrayList;

public class Problem5 {
    public static void main(String[] args) {
        ArrayList<Integer> multipliers = new ArrayList<>();
        multipliers.add(2);
        for (int i = 3; i < 21; i++) {
            int num = i;
            for (Integer Int : multipliers) {
                if (num % Int == 0) {
                    num /= Int;
                }
            }
            if (num > 1) {
                multipliers.add(num);
            }
        }
        int result = 1;
        for (int i : multipliers) {
            result *= i;
        }
        System.out.println(result);
    }
}
