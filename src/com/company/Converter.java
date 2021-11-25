package com.company;

public class Converter {
    public static String ArabToRim(int a) {
        String RimRez = "", Rim[] = {"I", "IV", "V", "IX", "X", "IL", "L", "IC", "C"};
        int Arab[] = {1, 4, 5, 9, 10, 40, 50, 90, 100};
        while (a > 0) {
            for (int i = 8; i >= 0; i--) {
                if (a >= Arab[i]) {
                    RimRez += Rim[i];
                    a -= Arab[i];
                    break;
                }
            }
        }
        return RimRez;
    }

    public static int RimToArab(String str) throws Exception {
        String Rim[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int Arab[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < 10; i++) {
            if (str.equals(Rim[i]))
                return Arab[i];
        }
        throw new Exception("используются одновременно разные системы счисления");
    }
}


