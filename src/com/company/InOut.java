package com.company;

import java.util.Scanner;

public class InOut {
    public static String[] input() throws Exception {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        String[] parts = str.split(" ");
        if (parts.length > 3)
            throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        return parts;
    }


    public static void output(int rezult, boolean arab, String[] parts) throws Exception {
        if (arab)
            System.out.println(parts[0] + " " + parts[1] + " " + parts[2] + " " + "=" + " " + rezult);
        else {
            if (rezult <= 0) throw new Exception("в римской системе нет отрицательных чисел");
            System.out.println(parts[0] + " " + parts[1] + " " + parts[2] + " " + "=" + " " + Converter.ArabToRim(rezult));
        }
    }
}