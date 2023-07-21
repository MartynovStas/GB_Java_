package org.example.lession2.HomeWork;

import java.util.Scanner;

public class Dz3 {
    public static void main(String[] args) {
        int[] arrey = {1, 22, 33, 44, 5, -5, -3, 23, -7};
        summelement(arrey);
        newmas(arrey);
        prinMas(arrey);

    }
    public static int summelement(int[] arr){
        int summ = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > 9) {
                summ += i;
            }
        }
        return summ;
    }
    public static int[] newmas(int[] mas){
        int nam = summelement(mas);
        for (int i = 0; i < mas.length; i++) {
            if(mas[i]<0){
                mas[i] = nam;
            }
        }
        return mas;
    }
    public static int[] prinMas(int[] mas){
        for(int i = 0; i <= mas.length-1; i++){
            System.out.print(" " + mas[i]);
        }
        return mas;
    }
}
