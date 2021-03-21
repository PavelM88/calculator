package ru.mamaev.calculator;

public class IncorrectFormatException extends Exception {

    public IncorrectFormatException() {
        System.out.println("Введен не верный формат операции!");
    }
}
