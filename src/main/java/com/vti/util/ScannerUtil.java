package com.vti.util;

import java.util.Scanner;

public class ScannerUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static String inputString() {
        return scanner.nextLine()
                .trim()
                .replaceAll("\\s{2,}", " ");
    }

    public static int inputInt() {
        while (true) {
            try {
                String input = inputString();
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.err.println("Yêu cầu nhập vào số nguyên.");
                System.err.println("Mời bạn nhập lại:");
            }
        }
    }
}
