//Каждый следующий элемент ряда Фибоначчи получается при сложении двух предыдущих.
//Начиная с 1 и 2, первые 10 элементов будут: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//Найдите сумму всех четных элементов ряда Фибоначчи, которые не превышают четыре миллиона.
//Ответ: 4613732

package ProjectEuler;

import java.sql.SQLOutput;

public class Problem2 {
    public static void main(String[] args) {
        int sum = 0, i = 1, j = 2;
        while (j <= 4_000_000) {
            if (j % 2 == 0) {
                sum += j;
            }
            int temp = j;
            j += i;
            i = temp;
        }
        System.out.println(sum);
    }
}
