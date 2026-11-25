package PraktikumP6;

import java.util.Scanner;

public class NilaiMahasiswa {
    public void jalankan() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine();

        String[] nama = new String[jumlah];
        int[] nilai = new int[jumlah];
        String[] status = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("Nama   : ");
            nama[i] = input.nextLine();
            System.out.print("Nilai  : ");
            nilai[i] = input.nextInt();
            input.nextLine();

            status[i] = (nilai[i] <= 50) ? "Tidak Lulus" : "Lulus";
        }

        System.out.println("=== Daftar Nilai Mahasiswa ===");
        System.out.printf("%-5s %-20s %-10s %-15s\n", "No", "Nama", "Nilai", "Status");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-5d %-20s %-10d %-15s\n", (i + 1), nama[i], nilai[i], status[i]);
        }
    }
}