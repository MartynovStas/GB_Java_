package org.example.lesson1.HomeWork;

import java.util.Scanner;

public class Dz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "здраствуй милый друг";
        System.out.println("Результат = " + revers(word));
        scanner.close();
    }

    /**=
     * @apiNote Обратные слова в строке
     * @param word принимаем строку
     * @return возвращяем элемент
     */
    public static String revers(String word) {
        String[] str = word.split(" ");
        word = "";
        for (int i = str.length - 1; i >= 0; i--)
            if (str[i] != "" && str[i] != " ") word += str[i]+ " ";
        return word.trim();
    };

}
