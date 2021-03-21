package ru.mamaev.calculator;

import java.util.Scanner;

public class ParserNumberAndCalculator {
    public void parserStringLine() throws IncorrectFormatException {
        int num1;
        int num2;
        String symbol;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Арабские или Римские числа от 1 до 10 и арифметческую операцию.\n" +
                " Пример: 1 + 1 или I + I");
        String input = scanner.nextLine();
        String[] strings = input.split(" ");
        if (strings.length > 3) {
            System.out.println("Некорректный ввод!");
        }
        try {
            num1 = Integer.parseInt(strings[0]);
            num2 = Integer.parseInt(strings[2]);
            symbol = strings[1];
            CalculatorImpl calculator = new CalculatorImpl();
            System.out.println(calculator.calculator(num1, num2, symbol));

        } catch (NumberFormatException e) {
            num1 = RomanNumber.romanNumeralsToInt(strings[0]);
            num2 = RomanNumber.romanNumeralsToInt(strings[2]);
            CalculatorImpl.romanCalculator(num1, num2, strings);
        }
    }
}
