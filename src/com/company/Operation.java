package com.company;

import java.util.Scanner;

public class Operation {

    public static void main(String[] args) {

        String ex;
        String op;
        double a;
        double b;

        Plus plus = new Plus();
        Minus minus = new Minus();
        Multi multi = new Multi();
        Division division = new Division();


        do {

            Scanner in = new Scanner(System.in);
            Scanner str = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            a = in.nextDouble();
            System.out.print("Введите операцию (+, -, * или /): ");
            op = str.nextLine();
            System.out.print("Введите второе число: ");
            b = in.nextDouble();

            if (op.contains("+")) {
                plus.execute(a, b);
            }

            if (op.contains("-")) {
                minus.execute(a, b);
            }

            if (op.contains("*")) {
                multi.execute(a, b);
            }

            if (op.contains("/")) {
                division.execute(a, b);
            }

            System.out.println("Для выхода из программы наберите \"выход\", для повторного запуска нажмите \"Enter\"");
            ex = str.nextLine();

        } while (!ex.equals("выход"));
    }

    void execute(double i, double j) {

    }
}

class Plus extends Operation {
    @Override
    void execute(double i, double j) {
        System.out.println("Результат: " + (i + j));
    }
}

class Minus extends Operation {
    @Override
    void execute(double i, double j) {
        System.out.println("Результат: " + (i - j));
    }
}

class Multi extends Operation {
    @Override
    void execute(double i, double j) {
        System.out.println("Результат: " + (i * j));
    }
}

class Division extends Operation {
    @Override
    void execute(double i, double j) {
        System.out.println("Результат: " + (i / j));
    }
}

