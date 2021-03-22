package ru.mamaev.calculator;

public class CalculatorImpl implements Calculator {
    /**
     * Метод calculator дляработы с арабскими цифрами
     *
     * @param x      - первое значение
     * @param y      - второе значение
     * @param symbol - арифметический знак
     * @return result
     * @throws IncorrectFormatException выбрасывает исключение, в случае неверного ввода symbol
     */
    @Override
    public int calculator(int x, int y, String symbol) throws IncorrectFormatException {
        int result = 0;
        if (x >= 1 && x <= 10 && y >= 1 && y <= 10) {
            switch (symbol) {
                case "+":
                    result = x + y;
                    break;
                case "-":
                    result = x - y;
                    break;
                case "*":
                    result = x * y;
                    break;
                case "/":
                    result = x / y;
                    break;
                default:
                    throw new IncorrectFormatException();
            }
            return result;
        } else {
            System.out.println("Введите число от 1 до 10!!!");
        }
        return result;
    }

    /**
     * Метод для работы с римскими цифрами
     *
     * @param num1    - первое значение
     * @param num2    - второе значение
     * @param strings - арифметический символ ("+", "-", "*", "/")
     * @throws IncorrectFormatException выбрасывает исключение если введен неверный символ операции
     */
    public static void romanCalculator(int num1, int num2, String[] strings) throws IncorrectFormatException {
        String symbol;
        if (num1 >= 1 && num1 <= 10 && num2 >= 1 && num2 <= 10) {
            symbol = strings[1];
            switch (symbol) {
                case "+":
                    System.out.println(RomanNumber.intToRomanNumeric(num1 + num2));
                    break;
                case "-":
                    System.out.println(RomanNumber.intToRomanNumeric(num1 - num2));
                    break;
                case "*":
                    System.out.println(RomanNumber.intToRomanNumeric(num1 * num2));
                    break;
                case "/":
                    System.out.println(RomanNumber.intToRomanNumeric(num1 / num2));
                    break;
                default:
                    throw new IncorrectFormatException();
            }
        } else {
            System.out.println("Введите число от I до X!!!");
        }
    }
}
