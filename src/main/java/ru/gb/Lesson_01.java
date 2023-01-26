package ru.gb;

import java.util.ArrayList;

public class Lesson_01 extends Lesson {
    public Lesson_01(String title) {
        super(title);

        addExercise(new Exercise_01(
                "Вычислить n-ое треугольного число (сумма чисел от 1 до n)",
                getScanner()));
        addExercise(new Exercise_02(
                "Вычислить n! (произведение чисел от 1 до n)",
                getScanner()));
        addExercise(new Exercise_03(
                "Вывести все простые числа от 1 до 1000 (простые числа - это числа\n" +
                        "которые делятся только на себя и на единицу без остатка. Чтобы найти" +
                        "остаток от деления используйте оператор % , например 10%3 будет равно" +
                        "единице)",
                getScanner()));
        addExercise(new Exercise_04(
                "Реализовать простой калькулятор" +
                        "(\"введите первое число\"... \"Введите второе число\"... \"" +
                        "укажите операцию, которую надо выполнить с этими числами\"... \"ответ: ...\")",
                getScanner()));
    }
}
