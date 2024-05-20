package util;

import java.util.Scanner;

public class ScannerUtil {
    private Scanner scanner = new Scanner(System.in);

    public int inputInt() {
        while (true) {
            try {
                var input = scanner.nextLine();
                var n = Integer.parseInt(input);
                return n;
            } catch (NumberFormatException exception) {
                System.err.println("Yêu cầu nhập vào số nguyên");
            }
        }
    }

    public int inputPositiveInt() {
        while (true) {
            try {
                var input = scanner.nextLine();
                var n = Integer.parseInt(input);
                if (n > 0) {
                    return n;
                } else {
                    System.err.println("Yêu cầu nhập vào số nguyên dương");
                }
            } catch (NumberFormatException exception) {
                System.err.println("Yêu cầu nhập vào số nguyên dương");
            }
        }
    }

    public float inputFloat() {
        while (true) {
            try {
                var input = scanner.nextLine();
                var n = Float.parseFloat(input);
                return n;
            } catch (NumberFormatException exception) {
                System.err.println("Yêu cầu nhập vào số thực");
            }
        }
    }

    public double inputDouble() {
        while (true) {
            try {
                var input = scanner.nextLine();
                var n = Double.parseDouble(input);
                return n;
            } catch (NumberFormatException exception) {
                System.err.println("Yêu cầu nhập vào số thực");
            }
        }
    }

    public String inputString() {
        return scanner.nextLine()
                .trim();
    }

    public String inputEmail() {
        while (true) {
            var input = inputString();
            if (input.contains("@")) {
                return input;
            } else {
                System.err.println("Yêu cầu email chứa kí tự @");
            }
        }
    }
}
