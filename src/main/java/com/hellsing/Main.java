package com.hellsing;

public class Main {

    public static void main(String[] args) {
        //0) Типы данных и их диапазоны
        byte varByte = 0; // -128 ... 127, 8 битное число
        short varShort = 0; // -32768 ... 32767, 16 битное число
        int varInt = 0; // -2147483648 ... 2147483647, 64 битное число
        long varLong = 0; // -9223372036854775808 ... 9223372036854775807, 32 битное число
        float varFloat; // 1.4e-45 ... 3.4e+38, 32 битное
        double varDouble; //4.9e-324 до 1.7e+308, 64 битное
        boolean varBoolean; //true/false
        char varChar; // символы Юникода

        //1) поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)
        // Математические операции
        int a = 35;
        int b = 5;

        System.out.println("\nМатематические операции:");
        System.out.println("a + b = " + (a + b)); // Сложение
        System.out.println("a - b = " + (a - b)); // Вычитание
        System.out.println("a * b = " + (a * b)); // Умножение
        System.out.println("a / b = " + (a / b)); // Целочисленное деление
        System.out.println("p % n = " + (b % a)); // Целочисленное деление
        System.out.println("a % b = " + (a % b)); // Остаток от деления
        System.out.println("a++   = " +  (++a)); // Прибавляем 1
        System.out.println("b--   = " +  (--b)); // Вычитаем 1

        // Логические операции
        int first = 4;
        int second = 11;

        System.out.println("\nЛогические операции:");
        System.out.println("first == second: " + (first == second));
        System.out.println("first > second: " + (first > second));
        System.out.println("first < second: " + (first < second));
        System.out.println("first != second: " + (first != second));
        System.out.println("first >= second: " + (first >= second));
        System.out.println("first <= second: " + (first <= second));


        // Проверка перегрузки

        System.out.println("\nПроверка перегрузки");
        int largeNumber = Integer.MAX_VALUE;
        System.out.println("Большое число: " + largeNumber);
        System.out.println("Большое число + 1: " + (largeNumber + 1));


        // 2) Проверка комбинаций типов данных int и double
        int intValue = 30;
        double doubleValue = 3.5;

        System.out.println("\nКомбинаций типов данных int и double:");
        System.out.println("Проверка сложения int и double: " + (intValue + doubleValue));
        System.out.println("Проверка вычитания int и double: " + (intValue - doubleValue));
        System.out.println("Проверка умножения int и double: " + (intValue * doubleValue));
        System.out.println("Проверка деления int и double: " + (intValue / doubleValue));
        System.out.println("Проверка остатка int и double: " + (intValue % doubleValue));


    }
}