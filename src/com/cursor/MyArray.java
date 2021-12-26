package com.cursor;

import java.util.Arrays;
import java.util.Random;

public class MyArray {
    public int[] array;

    public MyArray(int[] array) {
        this.array = array;
    }

    public void itialEvenNumbets() {
        System.out.print("\n task 1: Заповнити масив тільки парними числами\n");
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i;
            System.out.println(array[i]);
        }
    }

    public void randomNumber() {
        System.out.print("\n task 2: Заповнити масив рандомними числами\n");
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
            System.out.println(array[i]);
        }
    }

    public void averageValueArray() {
        System.out.print("\n task 3: Вивести середнє значення масиву\n");
        double sum = 0;
        for (int i : array)
            sum += i;
        System.out.println("середнє значення: " + sum / array.length);
    }


    public void sumValues() {
        System.out.print("\n task 4: Вивести суму всіх значень кратних 3\n");
        int summ = 0;
        for (int i = 0; i < 15; i++)
            if (i % 3 == 0) summ += i;
        System.out.println("Cума всіх значень кратних 3: " + summ);
    }

    public void evenValuesArray() {
        System.out.print("\n task 5: Вивести значення всіх парних індексів масиву\n");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    public void growingArray() {
        System.out.print("\n task 6: Просортувати масив в порядку зростання\n");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public void minNumber() {
        System.out.print("\n task 7: Вивести найменше значення в масиві\n");
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Min: " + min);
    }

    public void maxNamber() {
        System.out.print("\n task 8: Вивести найбільше значення масиву\n");
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max: " + max);
    }

    public void sumPairedIndices() {
        System.out.print("\n task 9: Вивести суму значень всіх парних індексів\n");
        int sum_parn = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum_parn += array[i];
            }
        }
        System.out.println("Сума значень всіх парних індексів: " + sum_parn);
    }

    public void tabASCII() {
        System.out.print("\n task 10: Вивести перших 20 символів з таблиці ASCII\n");
        for (char i = 32; i < 52; i++) {
            System.out.print((char) i + " ");
        }
    }
}