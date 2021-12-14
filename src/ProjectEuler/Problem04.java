//Число-палиндром с обеих сторон (справа налево и слева направо) читается одинаково.
//Самое большое число-палиндром, полученное умножением двух двузначных чисел – 9009 = 91 × 99.
//Найдите самый большой палиндром, полученный умножением двух трехзначных чисел.
//Ответ: 906609

package ProjectEuler;

public class Problem04 {
    public static void main(String[] args) {
        Loop:
        for (int x = 9; x > 0; x--) {
            for (int y = 9; y > -1; y--) {
                for (int z = 9; z > -1; z--) {
                    String palindrom = "" + x + y + z + z + y + x;
                    int palNum = Integer.parseInt(palindrom);
                    for (int i = 999; i > 99; i--) {
                        if (palNum % i == 0 & palNum / i > 99 & palNum / i < 1000) {
                            System.out.println(palindrom);
                            break Loop;
                        }
                    }
                }
            }
        }
    }
}
