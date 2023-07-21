package org.example.lession2.HomeWork;

public class Dz2 {
    public static void main(String[] args) {
        int[] arrey = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(posmas(arrey));
    }
    public static boolean posmas(int[] arr){
        boolean flag = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] >= arr[i + 1]){
                flag = false;
                return flag;
            }
        }
        return flag;
    }
}
