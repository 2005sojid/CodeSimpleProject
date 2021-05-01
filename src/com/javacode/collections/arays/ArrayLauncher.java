package com.javacode.collections.arays;

import java.util.Scanner;

public class ArrayLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Next element: ");
            int elem = scanner.nextInt();
            array[i] = elem;
        }
        int[] myArray = sort(array);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element #" + i + " = " + myArray[i]);
        }

    }

    private static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

}
