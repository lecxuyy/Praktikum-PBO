package PraktikumP6;

import java.util.Scanner;

class PekerjaThread extends Thread {
    private int nomorThread;

    public PekerjaThread(int nomorThread) {
        this.nomorThread = nomorThread;
    }

    public void run() {
        System.out.println("Thread Anak ke-" + nomorThread + " sedang berjalan (" + Thread.currentThread().getName() + ")");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println("Thread ke-" + nomorThread + " terhenti.");
        }
        System.out.println("Thread Anak ke-" + nomorThread + " selesai.");
    }
}

public class ThreadDiinginkan {
    public void jalankan() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah thread anak yang diinginkan: ");
        int jumlahThread = sc.nextInt();
        sc.nextLine(); // Membersihkan sisa karakter Enter

        System.out.println("Menjalankan " + jumlahThread + " thread anak dari Thread Utama...\n");

        for (int i = 1; i <= jumlahThread; i++) {
            PekerjaThread t = new PekerjaThread(i);
            t.start();
        }
    }
}