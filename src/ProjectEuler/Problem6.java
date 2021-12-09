//Сумма квадратов первых десяти натуральных чисел равна
//
//1^2 + 2^2 + ... + 10^2 = 385
//Квадрат суммы первых десяти натуральных чисел равен
//
//(1 + 2 + ... + 10)^2 = 55^2 = 3025
//Следовательно, разность между суммой квадратов и квадратом суммы первых десяти натуральных чисел составляет 3025 − 385 = 2640.
//
//Найдите разность между суммой квадратов и квадратом суммы первых ста натуральных чисел.
//Ответ: 25164150

package ProjectEuler;

public class Problem6 {
    public static void main(String[] args) {
        int n = 100;
        int sumSquare = n * (n + 1) * (2 * n + 1) / 6;
        int squareSum = (int) Math.pow(n * (n + 1) / 2, 2);
        System.out.println(Math.abs(sumSquare - squareSum));
    }
}
