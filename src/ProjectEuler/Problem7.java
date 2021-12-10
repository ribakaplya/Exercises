//Выписав первые шесть простых чисел, получим 2, 3, 5, 7, 11 и 13. Очевидно, что 6-е простое число - 13.
//
//Какое число является 10001-м простым числом?
//Ответ: 104743

package ProjectEuler;

import java.util.ArrayList;

public class Problem7 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        int i = 3;
        Loop:
        while (true) {
            for (int j : arr) {
                if (i % j == 0) {
                    i += 2;
                    continue Loop;
                }
            }
            arr.add(i);
            if (arr.size() > 10_000) {
                System.out.println(i);
                break;
            }
            i += 2;
        }
    }
}
