package org.example.lesson1.HomeWork;

import java.util.Scanner;

public class Dz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 1, 2, -1, 1, 3, 1, 3, -1, 0};
        System.out.println("Результат проверки: " + summElement(array));
        scanner.close();
    }

    /**
     * @apiNote Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
     * @param args Масив на вход
     * @return возырвт суммы
     */
    public static Integer summElement(int[] args) {
        int summ = 0;
        for(int i = 0; i< args.length;i++) {
            if (args[i] < 0) summ += args[i-1];
        }
        return summ;
    }
}
