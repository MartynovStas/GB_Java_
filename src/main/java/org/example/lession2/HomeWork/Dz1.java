package org.example.lession2.HomeWork;

public class Dz1 {
    public static void main(String[] args) {
        int[] arrey = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,};
        int sum = 0;
        for (int i = 0; i < arrey.length; i++) {
            if(prostnamber(arrey[i]) == true && arrey[i]>=2) sum += arrey[i];
        }
        System.out.println(sum);
    }

    public static boolean prostnamber(int num){
        for (int i = 2; i < num; i++) {
            if(num % i ==0) return false;

        }
        return true;
    }
}


