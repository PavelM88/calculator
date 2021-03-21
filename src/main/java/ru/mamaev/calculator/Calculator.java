package ru.mamaev.calculator;

public interface Calculator {
    int calculator(int x, int y, String symbol) throws IncorrectFormatException;
}
