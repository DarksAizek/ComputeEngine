package org.example;
public class SomeTask implements Task<Integer> {
    public Integer execute() {
        // Реализуйте здесь вашу вычислительную логику
        // Например, сложение двух чисел
        int a = 2;
        int b = 3;
        return a + b;
    }
}
