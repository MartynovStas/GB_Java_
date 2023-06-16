package org.example.lesson1.ClassWork;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Введите строку :");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("zadanie3(str) = " + zadanie3(str));
        scanner.close();
    }

    /**=
     * @apiNote Дана строка s, найдите длину самой длинной подстрока без повторяющихся символов.
     * @param str вводимое значение
     * @return возврат down and up
     */
    private static String zadanie3(String str) {
        String up = str.substring(0, str.length()/2);
        String down = str.substring(str.length()/2);
        return  down + up;
    }
}
