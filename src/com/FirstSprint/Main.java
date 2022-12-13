package com.FirstSprint;

import java.util.Scanner;


//      Функционал приложения:
//        1) Консольный интерфейс для управления программой
//        2) Хранение данных о количестве пройденных шагов за несколько месяцев
//        3) Ввод вашей цели по количеству шагов в день
//        4) Ввод пройденного количества шагов за день
//        5) Вывод статистики за определенный месяц
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
        Scanner scanner = new Scanner(System.in);
        printMenu(); // Меню для печати
        int userInput = scanner.nextInt();

        while (userInput != 4) {


            // Обработка разных случаев

            if (userInput == 1) {
                System.out.println("Введите название месяца: ");
                int month = scanner.nextInt();
                System.out.println("Введите номер дня: ");
                int day = scanner.nextInt();
                System.out.println("Введите количество пройденных шагов: ");
                int steps = scanner.nextInt();
                stepTracker.setStepsOnDate(month, day, steps);





            } else if (userInput == 2) {
                System.out.println("Введите номер месяца: "); // Команды будут позже
                int month = scanner.nextInt();
                //stepTracker.printArray();
                stepTracker.printMonth(month);



            } else if (userInput == 3) {
                System.out.println("команда 3"); // Команды будут позже
                stepTracker.printArray();

            } else if (userInput == 4) {
                System.out.println("команда 4"); // Команды будут позже

            } else {
                System.out.println("Такой команды нет"); // Команды будут позже
                break;
            }
            printMenu(); // Печатаем меню еще раз перед завершением предыдущего действия
            userInput = scanner.nextInt(); // Повторное считываение данных от пользователя


        }
        System.out.println("Программа завершена");
    }

    private static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1) Ввести количество шагов за" + "день.");
        System.out.println("2) Напечатать статистику за" + "месяц.");
        System.out.println("3) Изменить цель по количеству шагов в" + "день.");
        System.out.println("4) Выйти из приложения");
        System.out.print("Ввведите команду: ");


    }
}