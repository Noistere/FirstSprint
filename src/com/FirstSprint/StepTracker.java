package com.FirstSprint;


import java.util.Arrays;


public class StepTracker {
    int targetStepsPerDay = 10000;


    int [][] array = new int[12][30];





//    public void setStepsOnDate (int month, int day, int steps) { // Функция позволяет пользователю ввести месяц, день, шаги // Теперь не нужна, заменена на функцию isDailyStepsNotNegative
//        array[month - 1][day - 1] = steps;
//           }

    public void printMonth (int month) { // Функция печатает статистику за определенный месяц

        for (int i = 0; i < array.length; i++) {

            if (month>=1 && month<=12) {
                System.out.println("\nСтатистика за " + (month) + " месяц: \n");
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
    public void isDailyStepsNotNegative(int month, int day, int steps) { // Новая функция которая должна заменять отрицательное кол-во шагов на 0.
        // Сделал условие ввода шагов такое же как и в функции setStepsOnDate, но, если ввод больше нуля. А если меньше то ввод умножается на ноль.
        if (steps > 0) {
            array[month - 1][day - 1] = steps;
            // Здесь нужно реализовать чтобы отрицательное значение заменялось на 0.

        } else {
            array[month - 1][day - 1] = (steps * 0);
        }
    }
    public void summOfStepsPerMonth(int month) { // Функция считает общее количество шагов за выбранный месяц.
        int sum = 0;
        for (int i = 0; i < array[month-1].length; i++) {
            sum += array[month-1][i];

        }
        System.out.println("\nВ "+ month + "-м месяце вы прошли " + sum + " шагов.");


    }

    public void changeTargetOfSteps (int stepsSt) { // функция меняет стандартную цель по шагам по выбранному дню каждого месяца. Но цели по дням никуда не сохраняются, поэтому при вводе цели за новый день, отображается предыдущая цель.


        if (stepsSt > targetStepsPerDay) {
            targetStepsPerDay = stepsSt;
        } else if (stepsSt < targetStepsPerDay && stepsSt > 0) {
            targetStepsPerDay = stepsSt;
        } else if (stepsSt < 0) {
            System.out.println("\nОшибка! Целевое количество шагов не может быть меньше 0. \nВведите цифру больше 0.\n");

        }
        System.out.println("Новая цель по шагам за текущий день = " + targetStepsPerDay);
    }

    public void maxAmountOfStepsPerMonth (int month) { // Функция находит максимальное кличество шагов в выбранном месяце.
        int maos = 0;
        for (int i = 0; i < array[month-1].length; i++) {
            if (array[month-1][i] > maos) {
                maos = array[month-1][i];
            }

        }
        System.out.println("\nМаксимальное количество шагов: " + maos);
    }
    public void findAverage (int month) { // Функция считает среднее количество шагов в месяце
        int sum = 0;
        for (int i = 0; i < array[month-1].length; i++) {
            sum += array[month-1][i];

        }
        System.out.println("\nСреднее количесвто шагов в выбранном месяце: " + (float)sum / 30);
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






