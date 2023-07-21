package org.example.lession2.ClassWork;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину масива: ");
        int n = scanner.nextInt();
        int [] arrey = new int[n];
        for (int i = 0; i < n; i++) {
            arrey[i] = scanner.nextInt();
        }
        int[] resArr = namberSum(arrey);
        for (int elem:resArr
             ) {
            System.out.print(elem + " ");

        }
    }

    /**
     * @apiNote Заданн массивю. Мы определяем промежуточную сумму массива.
     * @param arrey массив чисел
     * @return
     */
    private static int[] namberSum(int[] arrey) {
        int[] result = new int[arrey.length];
        result[0] = arrey[0];
        for (int i = 1; i < arrey.length; i++) {
            result[i] = result[i-1] + arrey[i];
        }
        return result;
    }
}
