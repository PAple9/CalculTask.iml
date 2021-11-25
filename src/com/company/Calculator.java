package com.company;

public class Calculator {
    public static void main(String[] args) throws Exception {
        int b, a, rezult = 0;
        boolean arab = false;
        String[] parts = InOut.input();
        try {
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[2]);
            if (a < 1 || a > 10 || b < 1 || b > 10)
                throw new Exception("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.");
            arab = true;
        } catch (NumberFormatException e) {
            a = Converter.RimToArab(parts[0]);
            b = Converter.RimToArab(parts[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new Exception("строка не является математической операцией");
        }
        rezult = Calculate(a, b, parts[1]);
        InOut.output(rezult, arab, parts);
    }

    public static int Calculate(int a, int b, String oper) throws Exception {
        switch (oper) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                return a / b;
            case "*":
                return a * b;
        }
        throw new Exception("Неправильная операция");
    }
}

