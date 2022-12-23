package com.FirstSprint;

public class Converter {

//    В этом классе осуществляется преобразование шагов в километры и калории
//    Для подсчета дистанции: Один шаг = 75 см
//    Для подсчета количества сожженых калорий: 1 шаг = 50 калорий, 1 килокалория = 1000 калорий.
    int oneStep = 75;
    int oneCalorie = 50;

    public void convertSteps(int steps) { // Функция показывает пройденную дистанцию в месяце

        System.out.println("\nПройденная дистанция: " + (steps * oneStep / 100) + " метров.");

    }

    public void convertCalories(int steps) { // Функция показывает количество сожженых калорий в месяце
        System.out.println("\nСожженые калории: " + (steps * oneCalorie / 1000) + " килокалорий.");
    }

}
