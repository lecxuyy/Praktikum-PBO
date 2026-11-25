package PraktikumP7;

import java.util.Scanner;

class DataMahasiswa {
    String nama;
    String npm;
    String kelas;

    void setData(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    void tampilkanData() {
        System.out.println("=== Hasil Input Data ===");
        System.out.println("Nama  : " + this.nama);
        System.out.println("NPM   : " + this.npm);
        System.out.println("Kelas : " + this.kelas);
    }
}

public class DataDiriMhs {
    public void gasken(Scanner input) {
        System.out.println("=== Soal 7: Input & Tampil Data Dengan Keyword This ===");
        System.out.print("Masukkan Nama  : ");
        String nama = input.nextLine();

        System.out.print("Masukkan NPM   : ");
        String npm = input.nextLine();

        System.out.print("Masukkan Kelas : ");
        String kelas = input.nextLine();

        DataMahasiswa mhs = new DataMahasiswa();
        mhs.setData(nama, npm, kelas);
        mhs.tampilkanData();
        System.out.println("---------------------------------------------");
    }
}