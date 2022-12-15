package com.FirstSprint;


import java.util.Arrays;
import java.util.Scanner;

public class StepTracker {

    int [][] array = new int[12][30];





    public void setStepsOnDate (int month, int day, int steps) { // Функция позволяет пользователю ввести месяц, день, шаги
        array[month - 1][day - 1] = steps;
           }

    public void printMonth (int month) { // Функция печатает статистику за определенный месяц

        for (int i = 0; i < array.length; i++) {

            if (month>=1 && month<=12) {
                System.out.println("Статистика за " + (month) + " месяц: \n");
                System.out.println(Arrays.toString(array[month-1]));
                break;

            } else {
                System.out.println("Ошибка!\nВведен некорректный номер месяца.\n" + "Введите месяц от 1 до 12.\n");
                break;
            }
        }

    }

    public void printArray () { // Функция печатает статистику за весь год
        for (int[] a: array) {
            System.out.println(Arrays.toString(a));
        }
    }
    public void isDailyStepsNotNegative(int steps) { // Новая функция которая должна заменять отрицательное кол-во шагов на 0.
        if (steps < 0) {
            // Здесь нужно реализовать чтобы отрицательное значение заменялось на 0.
            System.out.println("Введенное значение не должно быть отрицательным");
        } else {

        }
    }

    // Ниже то же самый код что и в printArray но в другом формате

//    public void printMonth () {
//        for (int i = 0; i < array.length; i++) {
//
//            System.out.println(Arrays.toString(array[i]));
//        }
//
//
//        }


}







