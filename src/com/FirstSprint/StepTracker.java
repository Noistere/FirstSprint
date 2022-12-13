package com.FirstSprint;


import java.util.Arrays;

public class StepTracker {

    int [][] array = new int[12][30];


    public void setStepsOnDate (int month, int day, int steps) {
        array[month - 1][day - 1] = steps;
           }
    public void printMonth (int month) {
//        if (month == 1) {
//            System.out.println(Arrays.toString(array[0]));
//
//        } else if (month == 2) {
//            System.out.println(Arrays.toString(array[1]));
//        } else if (month == 3) {
//            System.out.println(Arrays.toString(array[2]));
//        } else if (month == 4) {
//            System.out.println(Arrays.toString(array[3]));
//        } else if (month == 5) {
//            System.out.println(Arrays.toString(array[4]));
//        } else if (month == 6) {
//            System.out.println(Arrays.toString(array[5]));
//        } else if (month == 7) {
//            System.out.println(Arrays.toString(array[6]));
//        } else if (month == 8) {
//            System.out.println(Arrays.toString(array[7]));
//        } else if (month == 9) {
//            System.out.println(Arrays.toString(array[8]));
//        } else if (month == 10) {
//            System.out.println(Arrays.toString(array[9]));
//        } else if (month == 11) {
//            System.out.println(Arrays.toString(array[10]));
//        } else if (month == 12) {
//            System.out.println(Arrays.toString(array[11]));
//        } else {
//            System.out.println("Введён некорректный номер месяца");
//        }
        for (int i = 0; i < array.length; i++) {

            if (i <= 11 || i >= 0) {
                System.out.println("Статистика за: " + (month) + " месяц.");
                System.out.println(Arrays.toString(array[month-1]));
                break;

            } else {
                System.out.println("Ошибка!\nВведен некорректный номер месяца.\n" + "Введите месяц от 1 до 12.\n");
                return;
            }
        }

    }

    public void printArray () {
        for (int[] a: array) {
            System.out.println(Arrays.toString(a));
        }
    }

    // Ниже то же самый код но в другом формате

//    public void printMonth () {
//        for (int i = 0; i < array.length; i++) {
//
//            System.out.println(Arrays.toString(array[i]));
//        }
//
//
//        }


}







