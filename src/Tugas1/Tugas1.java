package Tugas1;

import java.util.Random;
        import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int option;

        do {
            System.out.println("Menu:");
            System.out.println("1. Random Angka");
            System.out.println("2. Random String");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi (1/2/3): ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Masukkan batas bawah angka acak: ");
                    int lowerBound = scanner.nextInt();
                    System.out.print("Masukkan batas atas angka acak: ");
                    int upperBound = scanner.nextInt();

                    int randomInt = getRandomInt(lowerBound, upperBound);
                    System.out.println("Angka acak: " + randomInt);
                    break;

                case 2:
                    System.out.print("Masukkan panjang string acak: ");
                    int length = scanner.nextInt();

                    String randomString = getRandomString(length);
                    System.out.println("String acak: " + randomString);
                    break;

                case 3:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Opsi tidak valid. Silakan pilih lagi.");
                    break;
            }
        } while (option != 3);
    }

    private static int getRandomInt(int lowerBound, int upperBound) {
        return new Random().nextInt(upperBound - lowerBound + 1) + lowerBound;
    }

    private static String getRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = new Random().nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            randomString.append(randomChar);
        }

        return randomString.toString();
    }
}