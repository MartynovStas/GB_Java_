package org.example.lession2.ClassWork;

import java.util.Scanner;


public class Ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrey = new int[n];
        for (int i = 0; i < arrey.length; i++) {
            arrey[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("zadanie4 = " + zadanie4(arrey));;

    }

    /**
     * @apiNote1)	Дан массив целых чисел. Найти количество пар соседних элементов,
     * где первый элемент вдвое больше второго
     * @param arrey входящий массив
     * @return
     */
    private static int zadanie4(int[] arrey) {
        int k = 0;
        for (int i = 0; i < arrey.length-1; i++) {
            if(arrey[i] == arrey[i+1]*2){
                k++;
            }
        }
        return k;
    }
}
