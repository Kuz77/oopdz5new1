package org.example;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Logger logger = new Logger("log.txt");

        logger.log("логи1");

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Выберите тип чисел: ");
            System.out.println("1. Рациональные числа");
            System.out.println("2. Вещественные числа");
            System.out.println("0. Выход");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    RationalNumber rationalNumber1 = createRationalNumber(scanner);
                    RationalNumber rationalNumber2 = createRationalNumber(scanner);
                    rationalNumberOperations(rationalNumber1, rationalNumber2);
                    break;
                case 2:
                    RealNumber realNumber1 = createRealNumber(scanner);
                    RealNumber realNumber2 = createRealNumber(scanner);
                    realNumberOperations(realNumber1, realNumber2);
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неверный выбор.");
                    break;
            }

        } while (choice != 0);
        logger.close();
    }


    private static RationalNumber createRationalNumber(Scanner scanner) {
        System.out.print("Введите числитель: ");
        int numerator = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введите знаменатель: ");
        int denominator = scanner.nextInt();
        scanner.nextLine();

        return new RationalNumber(numerator, denominator);
    }

    private static RealNumber createRealNumber(Scanner scanner) {
        System.out.print("Введите число: ");
        double number = scanner.nextDouble();
        scanner.nextLine();

        return new RealNumber(number);
    }

    private static void rationalNumberOperations(RationalNumber number1, RationalNumber number2) {

        System.out.println("Выберите операцию для рациональных чисел: ");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                RationalNumber sum = number1.add(number2);
                System.out.println("Сумма: " + sum);
                break;
            case 2:
                RationalNumber difference = number1.subtract(number2);
                System.out.println("Разность: " + difference);
                break;
            case 3:
                RationalNumber product = number1.multiply(number2);
                System.out.println("Произведение: " + product);
                break;
            case 4:
                RationalNumber quotient = number1.divide(number2);
                System.out.println("Частное: " + quotient);
                break;
            default:
                System.out.println("Неверный выбор.");
                break;
        }
    }


    private static void realNumberOperations(RealNumber number1, RealNumber number2) {
        System.out.println("Выберите операцию для вещественных чисел: ");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                double sum = number1.add(number2);
                System.out.println("Сумма: " + sum);
                break;
            case 2:
                double difference = number1.subtract(number2);
                System.out.println("Разность: " + difference);
                break;
            case 3:
                double product = number1.multiply(number2);
                System.out.println("Произведение: " + product);
                break;
            case 4:
                double quotient = number1.divide(number2);
                System.out.println("Частное: " + quotient);
                break;
            default:
                System.out.println("Неверный выбор.");
                break;
        }



    }

}
