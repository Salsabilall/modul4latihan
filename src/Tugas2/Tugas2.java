package Tugas2;

import java.util.Arrays;
        import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        int[] data = {38, -15, 72, 0, -42, 19, -63, 50, 27, -84, 61, 5};

        Arrays.sort(data);

        System.out.println("Data yang sudah diurutkan:");
        for (int element : data) {
            System.out.print(element + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai yang ingin dicari indexnya: ");
        int targetValue = scanner.nextInt();

        int index = Arrays.binarySearch(data, targetValue);

        if (index >= 0) {
            System.out.println("Nilai ditemukan di index: " + index);
        } else {
            System.out.println("Nilai tidak ditemukan dalam data.");
        }

        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;

        for (int element : data) {
            if (element > 0) {
                countPositive++;
            } else if (element < 0) {
                countNegative++;
            } else {
                countZero++;
            }
        }

        System.out.println("Jumlah elemen dengan nilai positif: " + countPositive);
        System.out.println("Jumlah elemen dengan nilai negatif: " + countNegative);
        System.out.println("Jumlah elemen dengan nilai nol: " + countZero);
    }
}