package org.example.lesson1.ClassWork;

import java.util.Scanner;

public class Ex1 {public static void main(String[] args) {
    System.out.println("Hello world!");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.println("subtractProductAndSum(n) = " + subtractProductAndSum(n));
    scanner.close();
}

    /**=
     * @apiNote Для заданного целого числа nверните разницу между произведением его цифр и суммой его цифр .n
     * @param n заданное число число
     * @return результат
     */
    static int subtractProductAndSum(int n) {
        int sum = 0 , pr = 1;
        while(n != 0){
            pr*= n%10;
            sum+= n%10;
            n= n/10;
        }
        return pr-sum;
    }
}
