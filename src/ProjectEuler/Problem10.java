//Сумма простых чисел меньше 10 равна 2 + 3 + 5 + 7 = 17.
//
//Найдите сумму всех простых чисел меньше двух миллионов.
//Ответ: 142913828922

package ProjectEuler;

import java.util.ArrayList;

public class Problem10 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        long sum = 2L;
        Loop:
        for (int i = 3; i < 2_000_000; i += 2) {
            for (Integer j : arr) {
                if (i % j == 0) {
                    continue Loop;
                }
            }
            arr.add(i);
            sum += i;
        }
        System.out.println(sum);
    }
}


