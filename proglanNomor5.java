package org.proglan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih jenis konversi yang ingin Anda lakukan:");
        System.out.println("1. Binary ke Decimal");
        System.out.println("2. Decimal ke Binary");
        System.out.println("3. Hexadecimal ke Decimal");
        System.out.println("4. Decimal ke Hexadecimal");
        System.out.println("5. Octal ke Decimal");
        System.out.println("6. Decimal ke Octal");
        System.out.print("Pilihan Anda (1-6): ");

        try {
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    binaryToDecimal();
                    break;
                case 2:
                    decimalToBinary();
                    break;
                case 3:
                    hexToDecimal();
                    break;
                case 4:
                    decimalToHex();
                    break;
                case 5:
                    octalToDecimal();
                    break;
                case 6:
                    decimalToOctal();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            input.close();
        }
    }

    private static void binaryToDecimal() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan Binary: ");
        String binaryStr = input.next();
        int decimal = Integer.parseInt(binaryStr, 2);
        System.out.println("Hasil konversi ke Decimal: " + decimal);
    }

    private static void decimalToBinary() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan Decimal: ");
        int decimal = input.nextInt();
        String binaryStr = Integer.toBinaryString(decimal);
        System.out.println("Hasil konversi ke Binary: " + binaryStr);
    }

    private static void hexToDecimal() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan Hexadecimal: ");
        String hexStr = input.next();
        int decimal = Integer.parseInt(hexStr, 16);
        System.out.println("Hasil konversi ke Decimal: " + decimal);
    }

    private static void decimalToHex() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan Decimal: ");
        int decimal = input.nextInt();
        String hexStr = Integer.toHexString(decimal).toUpperCase();
        System.out.println("Hasil konversi ke Hexadecimal: " + hexStr);
    }

    private static void octalToDecimal() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan Octal: ");
        String octalStr = input.next();
        int decimal = Integer.parseInt(octalStr, 8);
        System.out.println("Hasil konversi ke Decimal: " + decimal);
    }

    private static void decimalToOctal() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan Decimal: ");
        int decimal = input.nextInt();
        String octalStr = Integer.toOctalString(decimal);
        System.out.println("Hasil konversi ke Octal: " + octalStr);
    }
}
