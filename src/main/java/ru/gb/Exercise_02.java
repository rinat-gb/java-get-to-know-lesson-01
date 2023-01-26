package ru.gb;

import java.util.Scanner;

/*
Вычислить n! (произведение чисел от 1 до n)
*/
public class Exercise_02 extends Exercise {
    public Exercise_02(String description, Scanner scanner) {
        super(description, scanner);
    }

    public void run() {
        super.run();
        System.out.print("Введите число n: ");

        int n = getScanner().nextInt();

        System.out.printf("Факториал %d равен ", n);

        double fact = 1.0;
        for (int i = 1; i <= n; i++) {
            fact *= i;

            System.out.print(i);

            if (i != n)
                System.out.print('*');
        }
        System.out.printf("=%f\n", fact);
    }
}
