//Простые делители числа 13195 - это 5, 7, 13 и 29.
//Каков самый большой делитель числа 600851475143, являющийся простым числом?
//Ответ: 6857

package ProjectEuler;

public class Problem03 {
    public static void main(String[] args) {
        long num = 600851475143L;
        int del = 2;
        while (num > 1) {
            if (num % del == 0) {
                num /= del;
                continue;
            }
            del++;
        }
        System.out.println(del);
    }
}
