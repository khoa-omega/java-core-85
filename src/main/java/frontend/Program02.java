package frontend;

import util.ScannerUtil;

public class Program02 {
    public static void main(String[] args) {
        ScannerUtil scannerUtil = new ScannerUtil();
        System.out.println("Nhập vào email:");
        var email = scannerUtil.inputEmail();
        System.out.println("email = " + email);
    }
}
