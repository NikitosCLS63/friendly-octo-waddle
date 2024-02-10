package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice ;

        do {
        System.out.println("Введите три целых числа a, b и c:");

        System.out.println("ВВЕДИТЕ  a:");
        int a = scanner.nextInt();// ввведем интовую переменную a

        System.out.println("ВВЕДИТЕ b:");
        int b = scanner.nextInt(); //введем интовую переменную b

        System.out.println("ВВЕДИТЕ c:");
        int c = scanner.nextInt();// введем переменную с

            if ((a + b > c) && (b + c > a) && (c + a > b)) { //задаем условие для выполнения кода
                if (a * a + b * b == c * c) { // задаем условие, что числа должны подходить под теорему пифагора
                    System.out.println(a + "    " + b + "   " + c + " является прямоугольным треугольником ");
                } else
                    if (a == b && b == c) { // задаем условие при котором а = b, и b = c
                    System.out.println(a + " " + b + "  " + c + " является равносторонним треугольником ");
                } else
                    if (a == b || b == c || c == a) { //задаем условие при котором а = b или b = c
                    System.out.println(a + "    " + b + "   " + c + " является равнобедренным треугольником ");
                } else
                {
                    System.out.println(a + "    " + b + "   " + c + " является просто треугольником ");
                }
            } else
            {
                System.out.println(a + "    " + b + "   " + c + "   не треугольник ");
            }
            System.out.println(" Продолжить подсчет? 1 - Да, 0 - Нет "); //возвращает программу с самого начало
            choice = scanner.nextInt();
        } while (choice != 0);
    }
}

