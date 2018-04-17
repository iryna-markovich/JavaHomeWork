package com.company.irynaMarkovich;

public class Main {

    public static void main(String[] args) {
        for (byte i = 0; i != -1; i++) {
            String binary = Integer.toBinaryString(i);
            if (binary.length() > 8) binary = binary.substring(binary.length() - 8);
            binary = String.format("%8s", binary).replace(" ", "0");
            System.out.printf("%8s %4d %n%n", binary, i);
        }
        for (byte i = 0; i != -1; i++) {
            String octal = Integer.toOctalString(i);
            if (octal.length() > 8) octal = octal.substring(octal.length() - 8);
            octal = String.format("%8s", octal).replace(" ", "0");
            System.out.printf("%8s %4d %n%n", octal, i);
        }
        for (byte i = 0; i != -1; i++) {
            String hex = Integer.toHexString(i);
            if (hex.length() > 8) hex = hex.substring(hex.length() - 8);
            hex = String.format("%8s", hex).replace(" ", "0");
            System.out.printf("%8s %4d %n%n", hex, i);
        }  // write your code here
    }
}
