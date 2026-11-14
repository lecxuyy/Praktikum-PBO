package PraktikumP6;

import java.util.Scanner;
import java.util.InputMismatchException;

public class NilaiRataRata {
    public void jalankan() {
        Scanner input = new Scanner(System.in);
        int n = 0;

        while (true) {
            try {
                System.out.print("Masukkan jumlah bilangan yang ingin dirata-ratakan: ");
                n = input.nextInt();
                if (n <= 0) throw new IllegalArgumentException("Jumlah harus lebih dari 0.");
                break;
            } catch (InputMismatchException e) {
                System.out.println("[Error] Masukan harus berupa angka integer! Coba lagi.\n");
                input.next();
            } catch (IllegalArgumentException e) {
                System.out.println("[Error] " + e.getMessage() + "\n");
            }
        }

        double[] bilangan = new double[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                    bilangan[i] = input.nextDouble();
                    total += bilangan[i];
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("[Exception Handling] Input bukan bilangan valid! Masukkan ulang.");
                    input.next();
                }
            }
        }

        System.out.println("\nTotal keseluruhan: " + total);
        System.out.println("Nilai rata-rata: " + (total / n));
    }
}