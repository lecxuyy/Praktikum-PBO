package PraktikumP6;

import java.util.Scanner;
import java.util.Arrays;

public class VariabelArray {
    public void jalankan() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Masukkan " + n + " nilai elemen:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        int max = arr[0], min = arr[0], idxMax = 0, idxMin = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) { max = arr[i]; idxMax = i; }
            if (arr[i] < min) { min = arr[i]; idxMin = i; }
        }
        System.out.println("\nNilai terbesar: " + max + " pada indeks ke-" + idxMax);
        System.out.println("Nilai terkecil: " + min + " pada indeks ke-" + idxMin);

        double total = 0;
        for (int val : arr) { total += val; }
        System.out.println("Jumlah total: " + total + " | Rata-rata: " + (total / n));

        int sumGanjilIdx = 0, sumGenapIdx = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) sumGanjilIdx += arr[i];
            else sumGenapIdx += arr[i];
        }
        System.out.println("Jumlah indeks ganjil: " + sumGanjilIdx);
        System.out.println("Jumlah indeks genap: " + sumGenapIdx);

        String jenisHasil = (sumGanjilIdx % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Check penjumlahan indeks ganjil (" + sumGanjilIdx + "): " + jenisHasil);

        Arrays.sort(arr);
        System.out.println("Array setelah diurutkan: " + Arrays.toString(arr));
    }
}