package ru.mamaev.calculator;

public class RomanNumber {
    public static int scoreToInt(int firstNumber, int lastNumber, int number) {
        if (lastNumber > firstNumber) {
            return number - firstNumber;
        } else {
            return number + firstNumber;
        }
    }

    public static int romanNumeralsToInt(String romanNumerals) {
        romanNumerals = romanNumerals.toUpperCase();
        int number = 0;
        int lastNumber = 0;
        for (int i = romanNumerals.length() - 1; i >= 0; i--) {
            char convert = romanNumerals.charAt(i);
            switch (convert) {
                case 'C':
                    number = scoreToInt(100, lastNumber, number);
                    lastNumber = 100;
                    break;
                case 'L':
                    number = scoreToInt(50, lastNumber, number);
                    lastNumber = 50;
                    break;
                case 'X':
                    number = scoreToInt(10, lastNumber, number);
                    lastNumber = 10;
                    break;
                case 'V':
                    number = scoreToInt(5, lastNumber, number);
                    lastNumber = 5;
                    break;
                case 'I':
                    number = scoreToInt(1, lastNumber, number);
                    lastNumber = 1;
                    break;
                default:
                    return -1;
            }
        }
        return number;
    }

    public static String intToRomanNumeric(int num) {
        StringBuilder romanNumber = new StringBuilder();
        if (num == 0) {
            return "0 - не существует в римских числах!";
        }
        if (num < 1 || num > 399) {
            return "Недействительное значение римского числа!";
        }
        while (num >= 100) {
            romanNumber.append("C");
            num -= 100;
        }
        while (num >= 90) {
            romanNumber.append("XC");
            num -= 90;
        }
        while (num >= 50) {
            romanNumber.append("L");
            num -= 50;
        }
        while (num >= 40) {
            romanNumber.append("XL");
            num -= 40;
        }
        while (num >= 10) {
            romanNumber.append("X");
            num -= 10;
        }
        while (num >= 9) {
            romanNumber.append("IX");
            num -= 9;
        }
        while (num >= 5) {
            romanNumber.append("V");
            num -= 5;
        }
        while (num >= 4) {
            romanNumber.append("IV");
            num -= 4;
        }
        while (num >= 1) {
            romanNumber.append("I");
            num -= 1;
        }
        return romanNumber.toString();
    }
}

