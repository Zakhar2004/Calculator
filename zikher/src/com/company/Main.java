package com.company;









import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            System.out.println("1.Умножение");
            System.out.println("2.Сложение");
            System.out.println("3.Вычитанеи.");
            System.out.println("4.Деление");


            for (int i = 0; i < 100; i++) {

                Scanner scanner = new Scanner(System.in);
                int operation = scanner.nextInt();
                if (operation > 4 || operation < 1) {
                    System.out.println("Условие введено неправильно!");
                    continue;
                }
                System.out.println("Введите первое число : ");
                int a = scanner.nextInt();
                System.out.println("Введите второе число: ");
                int b = scanner.nextInt();
                int result;
                String error;


                if (operation == 1) {
                    result = a * b;
                } else if (operation == 2) {
                    result = a + b;
                } else if (operation == 3) {
                    result = a - b;
                } else   {
                    result = a / b;
                }

                 System.out.println("Результат = " + result);
                scanner.close();
                break;
            }
        }
    }







