package org.example.lession2.ClassWork;

import java.util.Scanner;



public class Ex3 {
    public static void main(String[] args) {

        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("zadanie3(n, scanner) = " + zadanie4(n, scanner));
    }

    /**
     * @apiNote 2)	Дана последовательность из N целых чисел. Найти сумму чисел,
     * оканчивающихся на 5, перед которыми идет четное число.
     * @param n длина последовательности
     * @param scanner вспомагательный класс
     * @return сумма чисел
     */
    private static int zadanie4(int n, Scanner scanner) {
        int sum = 0;
        int n1 = scanner.nextInt();
        for (int i = 0; i < n-1; i++) {
            int n2 = scanner.nextInt();
            if (n2 %10 == 5 && n1 %2 ==0){
                sum += n2;
            }
            n1= n2;
        }
        return sum;
    }
}
