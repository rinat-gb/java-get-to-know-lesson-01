package ru.gb;

import java.util.Scanner;

/*
Реализовать простой калькулятор
("введите первое число"... "Введите второе число"... "
укажите операцию, которую надо выполнить с этими числами"... "ответ: ...")
*/
public class Exercise_04 extends Exercise {
    public Exercise_04(String description, Scanner scanner) {
        super(description, scanner);
    }

    public void run() {
        super.run();

        System.out.print("Введите первое число: ");
        double a = getScanner().nextDouble();
        System.out.print("Введите второе число: ");
        double b = getScanner().nextDouble();

        char oper;
        while (true) {
            System.out.print("Введите операцию (+, - , *  или /): ");

            oper = getScanner().next().charAt(0);
            if (oper == '+' || oper == '-' || oper == '*' || oper == '/')
                break;
            System.out.println("Неправильная операция!");
        }

        if (oper == '/' && b == 0) {
            System.out.println("Делить на 0 нельзя!");
        } else {
            double res;

            switch (oper) {
                case '+':
                    res = a + b;
                    break;
                case '-':
                    res = a - b;
                    break;
                case '*':
                    res = a * b;
                    break;
                case '/':
                    res = a / b;
                    break;
                default:
                    res = 0;
                    break;
            }

            System.out.printf("Результат %f %c %f равен %f\n", a, oper, b, res);
        }
    }
}
