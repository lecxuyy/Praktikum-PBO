package PraktikumP6;

import java.util.Scanner;

public class PenjumlahanMatriks {
    public void jalankan() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris matriks: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = input.nextInt();

        int[][] matrixA = new int[baris][kolom];
        int[][] matrixB = new int[baris][kolom];

        System.out.println("\n=== Input Matriks A ===");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matrixA[i][j] = input.nextInt();
            }
        }

        System.out.println("\n=== Input Matriks B ===");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matrixB[i][j] = input.nextInt();
            }
        }

        System.out.println("\nHasil Penjumlahan Matriks (A + B):");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print((matrixA[i][j] + matrixB[i][j]) + "\t");
            }
            System.out.println();
        }
    }
}