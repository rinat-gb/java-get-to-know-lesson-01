package ru.gb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lesson {
    private String title;
    private Scanner scanner = new Scanner(System.in);
    private List<Exercise> exercises = new ArrayList<>();

    public Lesson(String title) {
        this.title = new String(title);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void showExercises() {
        for (int i = 0; i < exercises.size(); i++) {
            System.out.printf("%d: %s\n\n", i + 1, exercises.get(i));
        }
    }

    public void addExercise(Exercise ex) {
        exercises.add(ex);
    }

    public void runExercise(int num) {
        exercises.get(num).run();
    }

    public int menu() {
        System.out.println(title);
        System.out.println();

        showExercises();

        while (true) {
            System.out.print("Введите номер задания или нажмите 'Q' для выхода: ");

            char ch = scanner.next().charAt(0);
            if (ch == 'q' || ch == 'Q') {
                return -1;
            }

            int choise = Character.getNumericValue(ch);
            if (choise >= 1 && choise <= exercises.size()) {
                System.out.println();
                return choise - 1;
            }

            System.out.println("Неправильный ввод");
        }
    }
}
