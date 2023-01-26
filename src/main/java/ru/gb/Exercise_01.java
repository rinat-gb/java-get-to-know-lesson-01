package ru.gb;

import java.util.Scanner;

/*
Вычислить n-ое треугольного число (сумма чисел от 1 до n)\
*/
public class Exercise_01 extends Exercise {
    public Exercise_01(String description, Scanner scanner) {
        super(description, scanner);
    }

    public void run() {
        super.run();
        System.out.print("Введите число n: ");

        int n = getScanner().nextInt();

        System.out.printf("Сумма чисел от 1 до %d включительно: ", n);

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;

            System.out.print(i);

            if (i != n)
                System.out.print('+');
        }
        System.out.printf("=%d\n", sum);
    }
}
