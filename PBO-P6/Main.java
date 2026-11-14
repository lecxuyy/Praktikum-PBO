package PraktikumP6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Pilihan Soal 1-10 ===");
            System.out.println("1.  Jalankan Soal 1 (Variasi Array)");
            System.out.println("2.  Jalankan Soal 2 (Ubah Array Mobil)");
            System.out.println("3.  Jalankan Soal 3 (Operasi Array 1D)");
            System.out.println("4.  Jalankan Soal 4 (Daftar Nilai Mahasiswa)");
            System.out.println("5.  Jalankan Soal 5 (Penjumlahan Matriks)");
            System.out.println("6.  Jalankan Soal 6 (Exception Handling)");
            System.out.println("7.  Jalankan Soal 7 (Pewarisan Thread)");
            System.out.println("8.  Jalankan Soal 8 (Multiple Threads)");
            System.out.println("9.  Jalankan Soal 9 (Perulangan Array age)");
            System.out.println("10. Jalankan Soal 10 (Array Campuran Object)");
            System.out.println("0.  Keluar");
            System.out.print("Pilih nomor soal yang ingin di-run: ");
            
            pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    new VariasiSyntaks().jalankan();
                    break;
                case 2:
                    new Mobil().jalankan();
                    break;
                case 3:
                    new VariabelArray().jalankan();
                    break;
                case 4:
                    new NilaiMahasiswa().jalankan();
                    break;
                case 5:
                    new PenjumlahanMatriks().jalankan();
                    break;
                case 6:
                    new NilaiRataRata().jalankan();
                    break;
                case 7:
                    new MewarisiThread().jalankan();
                    break;
                case 8:
                    new ThreadDiinginkan().jalankan();
                    break;
                case 9:
                    new Perulangan().jalankan();
                    break;
                case 10:
                    new SintaksMenampung().jalankan();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia!");
            }
        } while (pilihan != 0);

        input.close();
    }
}