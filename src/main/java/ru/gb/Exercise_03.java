package ru.gb;

import java.util.Scanner;

/*
Вывести все простые числа от 1 до 1000 (простые числа - это числа
которые делятся только на себя и на единицу без остатка. Чтобы найти
остаток от деления используйте оператор % , например 10%3 будет равно
единице)
*/
public class Exercise_03 extends Exercise {
    public Exercise_03(String description, Scanner scanner) {
        super(description, scanner);
    }

    public void run() {
        super.run();
        System.out.println("Простые числа от 1 до 1000:\n");

        for (int i = 1, num = 0; i <= 1000; i++) {
            if (isSimple(i)) {
                System.out.printf("%d ", i);
                ++num;
            }

            if (num > 16) {
                System.out.println();
                num = 0;
            }
        }
        System.out.println();
    }

    private boolean isSimple(int n) {
        if (n <= 3)
            return true;
        else if (n % 2 == 0 || n % 3 == 0)
            return false;
        int i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
            i = i + 6;
        }
        return true;
    }
}
