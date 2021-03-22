package ru.mamaev.calculator;

/**
 * Общий интерфейс для работы калькулятора
 */
public interface Calculator {
    int calculator(int x, int y, String symbol) throws IncorrectFormatException;
}
