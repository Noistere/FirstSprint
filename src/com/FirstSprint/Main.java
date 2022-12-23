package com.FirstSprint;

import java.util.Scanner;


//      Функционал приложения:
//        1) Консольный интерфейс для управления программой - ЕСТЬ!
//        2) Хранение данных о количестве пройденных шагов за несколько месяцев - ЕСТЬ!
//        3) Ввод вашей цели по количеству шагов в день
//        4) Ввод пройденного количества шагов за день - ЕСТЬ!
//        5) Вывод статистики за определенный месяц - ЕСТЬ!
public class Main {
    //    В классе Main должно быть реализовано считывание команд и вызов методов из основного класса приложения StepTracker.
//
//    Для пользователя должны быть доступны следующие действия:
//    1) Ввести количество шагов за определенный день
//    2) Напечатать статистику за определенный месяц
//    3) Изменить цель по количеству шагов в день
//    4) Выйти из приложения
    public static void main(String[] args) {
        StepTracker stepTracker = new StepTracker(); // Создал объект на основе класса StepTracker
        Converter converter = new Converter(); // Создал объект на основе класса Converter
        Scanner scanner = new Scanner(System.in);
        printMenu(); // Меню для печати
        int userInput = scanner.nextInt();

        while (userInput != 11) {


            // Обработка разных случаев

            if (userInput == 1) {
                System.out.println("\n 1 - Январь; 2 - Февраль; 3 - Март; 4 - Апрель; 5 - Май; 6 - Июнь; 7 - Июль; 8 - Август; 9 - Сентябрь; 10 - Октябрь; 11 - Ноябрь; 12 - Декабрь. \n");
                System.out.print("Введите номер месяца: ");
                int month = scanner.nextInt();
                System.out.print("Введите номер дня от 1 до 30: ");
                int day = scanner.nextInt();
                System.out.print("Введите количество пройденных шагов за " + day + " день месяца: " );
                int steps = scanner.nextInt();
                stepTracker.isDailyStepsNotNegative(month, day, steps); // Новая функция которая должна заменять отрицательное кол-во шагов на 0.
                //stepTracker.setStepsOnDate(month, day, steps); // Эта функция теперь не нужна! Заменена на isDailyStepsNotNegative!





            } else if (userInput == 2) {
                System.out.print("Введите номер месяца: "); // Команды будут позже
                int month = scanner.nextInt();
                //stepTracker.printArray();
                stepTracker.printMonth(month);



            } else if (userInput == 3) {
                System.out.println("\n Статистика за год: "); // Команды будут позже
                stepTracker.printArray();



            } else if (userInput == 4) {
                System.out.print("\nВведите номер месяца: \n");
                int month = scanner.nextInt();
                stepTracker.summOfStepsPerMonth(month);




            } else if (userInput == 5) {
                System.out.println("\n Стандартная цель по шагам за день = 10000 шагов.");
                System.out.println("\n Установка цели по шагам:");
                System.out.println("\n 1 - Январь; 2 - Февраль; 3 - Март; 4 - Апрель; 5 - Май; 6 - Июнь; 7 - Июль; 8 - Август; 9 - Сентябрь; 10 - Октябрь; 11 - Ноябрь; 12 - Декабрь. \n");
                System.out.print("Введите номер месяца: ");
                int monthSt = scanner.nextInt();
                System.out.print("Введите номер дня от 1 до 30: ");
                int daySt = scanner.nextInt();
                System.out.print("Введите цель по шагам за " + daySt + " день " + monthSt + "-го месяца: " );
                int stepsSt = scanner.nextInt();
                stepTracker.changeTargetOfSteps(stepsSt);





            } else if (userInput == 6) {
                System.out.print("Введите номер месяца: ");
                int month = scanner.nextInt();
                stepTracker.maxAmountOfStepsPerMonth(month);


            } else if (userInput == 7) {
                System.out.print("Введите номер месяца: ");
                int month = scanner.nextInt();
                stepTracker.findAverage(month);


            } else if (userInput == 8) {
                System.out.print("\nВведите количество шагов: ");
                int steps = scanner.nextInt();
                converter.convertSteps(steps);


            } else if (userInput == 9) {
                System.out.print("\nВведите количество шагов: ");
                int steps = scanner.nextInt();
                converter.convertCalories(steps);


            } else if (userInput == 10) {
                System.out.println("Команда");


            } else if (userInput == 11) {

                // Это выход из программы

            } else {
                System.out.println("\nТакой команды нет. Введите команду от 1 до 11."); // Команды будут позже

            }
            printMenu(); // Печатаем меню еще раз перед завершением предыдущего действия
            userInput = scanner.nextInt(); // Повторное считываение данных от пользователя


        }
        System.out.println("Программа завершена.");
    }

    private static void printMenu() {
        System.out.println("\n Что вы хотите сделать?\n");
        System.out.println("1) Ввести количество шагов за месяц и за день.");
        System.out.println("2) Напечатать статистику за месяц. ");
        System.out.println("3) Напечатать статистику за год. ");
        System.out.println("4) Узнать общее количество шагов за месяц.");
        System.out.println("5) Изменить цель по количеству шагов в день.");
        System.out.println("6) Показать максимально пройденное количество шаго в месяце");
        System.out.println("7) Показать среднее количество шагов в месяце");
        System.out.println("8) Показать пройденную дистанцию в месяце");
        System.out.println("9) Узнать количество сожженных килокалорий");
        System.out.println("10) Показать лучшую серию");
        System.out.println("11) Выйти из приложения");
        System.out.print("\n Ввведите команду: ");


    }
}